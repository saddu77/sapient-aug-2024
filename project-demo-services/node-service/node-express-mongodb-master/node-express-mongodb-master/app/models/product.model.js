module.exports = mongoose => {
    var schema = mongoose.Schema(
      {
        product_id: String,
        product_name: String,
        product_qty: Number,
        product_price:Number
      },
      { timestamps: true }
    );
  
    schema.method("toJSON", function() {
      const { __v, _id, ...object } = this.toObject();
      object.id = _id;
      return object;
    });
  
    const Product = mongoose.model("product", schema);
    return Product;
  };
  