import { render, screen, fireEvent } from "@testing-library/react";
import { App } from "./App";
import { rest } from "msw";
import { setupServer } from "msw/node";

const response = { quote: "...loading quote", speaker: "...loading speaker" };

const server = setupServer(
  rest.get(process.env.REACT_APP_API, (req, res, ctx) => {
    return res(ctx.json(response));
  })
);

test("renders the app with a button, a quote and an image", () => {
  render(<App />);

  const buttonEl = screen.getByRole("button");
  const imageEl = screen.getByRole("img");

  expect(buttonEl).toBeInTheDocument();
  expect(imageEl).toBeInTheDocument();
});

test("calls an api on button click and update its text", async () => {
  render(<App />);

  const buttonEl = screen.getByRole("button");
  fireEvent.click(buttonEl);

  const quoteEl = await screen.findByText(response.quote);

  expect(quoteEl).toBeInTheDocument();
});

test("calls api on startup and renders its response", async () => {
  render(<App />);

  const quoteEl = await screen.findByText(response.quote);
  expect(quoteEl).toBeInTheDocument();
});
