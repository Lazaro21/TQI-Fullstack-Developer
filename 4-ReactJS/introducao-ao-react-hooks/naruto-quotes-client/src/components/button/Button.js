import { string } from "prop-types";
import styled from "styled-components";

// export const Button = ({ children }) => {
//   return <buttonStyled>{children}</buttonStyled>;
// };

// Button.propTypes = {
//   children: string
// }

export const Button = styled.button`
  background: #DC882D;
  color: #fff;
  border: none;
  border-radius: 0;
  font-size: 1.5em;
  padding: 10px 20px;
  font-family: 'New Tegomin', serif;
  cursor: pointer;
  box-shadow: #333 3px 3px;

  &:hover {
    background: #a40000;
  }
`
