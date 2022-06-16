import React from "react";
import PropTypes from 'prop-types';

const ListItem = ({ children }) => {
  return (
    <div>
      <li>{children}</li>
    </div>
  );
};

ListItem.propTypes = {
  children: PropTypes.node.isRequired,
};

export default ListItem;
