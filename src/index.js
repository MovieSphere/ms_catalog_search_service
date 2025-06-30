const { log } = require('./logger');

exports.searchProducts = (query) => {
  log(`Buscando productos para: ${query}`);
  
  return [
    { id: 1, name: `${query} modelo premium` },
    { id: 2, name: `${query} modelo estándar` }
  ];
};