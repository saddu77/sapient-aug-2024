const db = require("../models");
const Product = db.products;

// Create and Save a new Product
exports.create = (req, res) => {
    // Validate request
  
  
    // Create a Tutorial
    const product = new Product({
        product_id: req.body.product_id,
        product_name: req.body.product_name,
        product_qty: req.body.product_qty ,
        product_price: req.body.product_price,
    });
  
    // Save Tutorial in the database
    product
      .save(product)
      .then(data => {
        res.send(data);
      })
      .catch(err => {
        res.status(500).send({
          message:
            err.message || "Some error occurred while creating the Product."
        });
      });
  };

// Retrieve all Products from the database.
exports.findAll = (req, res) => {  
  
    Product.find()
      .then(data => {
        res.send(data);
      })
      .catch(err => {
        res.status(500).send({
          message:
            err.message || "Some error occurred while retrieving products."
        });
      });
  };