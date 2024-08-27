import { Link } from "react-router-dom"

function Login(){
    return(
        <div id="login-div">
        <h2>Login</h2>
            Username: <input type="text" /> <br /> <br />
            Password: <input type="password" /><br /> <br />
            <Link id="link" to="/home"><button>Login</button></Link><br /> <br />
            <Link id="link" to="/signup">Not yet Registred ? Sign up</Link>
        </div>
    )
}

export default Login