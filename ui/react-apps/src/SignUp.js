import { Link } from "react-router-dom"
import {useState} from 'react';
function SignUp(){
    //hook
    const [uname,setUsername] = useState('');
    const [pwd,setPassword] = useState('');
    //arrow function
    const save = () => {
        // alert(uname + " " + pwd);
        fetch("http://localhost:5000/createuser",{
            method:"POST",
            headers: {'Content-Type':'application/json'},
            body:JSON.stringify({
                "email":uname,
                "password":pwd
            })
        }).then(
            res => res.json()
        ).then(res => {
            alert("User saved Successfully");
        });
    }
    return(
        <div id="signup-div">
            <h2>Sign Up</h2>
            Username: <input type="text" onChange={(event) => setUsername(event.target.value)}/> <br /> <br />
            Password: <input type="password" onChange={(event) => setPassword(event.target.value)}/><br /> <br />
            <input type="submit" value="Sign Up" onClick={save}/> <br /> <br />
            <Link id="link" to="/login">Already Registed !!! Login</Link>            
        </div>
    )
}
export default SignUp