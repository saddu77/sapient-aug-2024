const http = require("http");
const server = http.createServer((req,res) =>{   
    res.writeHead(200,{'Content-Type':'text/html'});
    res.end('<h2> Welcome to Node !!! Learning Web App Development</h2>')
});

server.listen(5000,()=>{
    console.log("Server is running at http://localhost:5000/")
});