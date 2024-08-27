const express = require('express')
const mongoose = require("mongoose");
const cors = require('cors')


const app = express()
const port = 5000
app.use(express.json())
app.use(cors())
mongoose.connect("mongodb://localhost:27017/ssd_blr", {
   useNewUrlParser: true,
   useUnifiedTopology: true
});

const userSchema = {
    email: String,
    password: String,
 }; 
 const User = mongoose.model("User", userSchema);

 app.get('/getusers', async (req, res) => {
    try {
      // Fetch all users from MongoDB
      const data = await User.find();
      
      // Send the response to the client
      res.json(data);
  
      // If you want to log the data, do it after sending the response
      console.log(data);
    } catch (error) {
      // Handle any errors
      res.status(500).send({ error: 'Failed to fetch users' });
    }
  });

//POST API to validate user 
app.post('/validate_user',(req,res) => {
    const email = req.body.email;
    const pwd = req.body.password;
    //we have recieved email and password from request
    //further fetch record from db by Email: findByEmail
    //once record if fetched,compare email and pwd
    //if email and pwd matched then return {'isUserValid':true}
    //else return {'isUserValid':false}
});


app.post('/createuser',(req,res)=>{
    // create a new a user in mongodb
    // const email = req.body.email;
    // const pwd = req.body.password;
    // console.log("Email is : " + email);
    // console.log("Password is: " + pwd);
    const user = new User({
        email: req.body.email,
        password: req.body.password,
    });
    user.save().then(()=>{
        res.send({"status":"user created successfully"});
    }).catch((err)=>{
        console.log(err);
    }) 
});

app.put('/updateuser/:id', async (req, res) => {
    const id = req.params.id;

    try {
        // Update user in MongoDB based on id
        const updateResult = await User.findByIdAndUpdate(
            id,
            { email: req.body.email, password: req.body.password },
        );

        if (updateResult) {
            res.send('User updated successfully.');
        } else {
            res.status(404).send('User not found.');
        }
    } catch (error) {
        res.status(500).send('Error updating user: ' + error.message);
    }
});

app.delete('/deleteuser/:id', async (req, res) => {
    const id = req.params.id;

    try {
        // Delete user in MongoDB based on id
        const deleteResult = await User.findByIdAndDelete(id);

        if (deleteResult) {
            res.send('User deleted successfully.');
        } else {
            res.status(404).send('User not found.');
        }
    } catch (error) {
        res.status(500).send('Error deleting user: ' + error.message);
    }
});



app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})