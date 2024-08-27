import { useEffect, useState } from 'react';
import {Link,Navigate} from 'react-router-dom';

function UsersList(){
    // const navigate = Navigate();
    //useSate hook used to save users response 
    const [users_data,setUsers]=useState([0]);
    const [updated_user_email,setUpdateEmail] = useState('');
    const [updated_user_pwd,setUpdatePassword] = useState('');
    useEffect(() =>{
       fetch("http://localhost:5000/getusers")
       .then(resp => resp.json())
       .then((resp)=>{
            console.log(resp);
            setUsers(resp);
       })
    },[]);

    
    const updateUser =(id) => {
        // alert(id + " " + updated_user_email + " " + updated_user_pwd)
        fetch("http://localhost:5000/updateuser/" + id,{
            method:"PUT",
            headers: {'Content-Type':'application/json'},
            body:JSON.stringify({
                "email":updated_user_email,
                "password":updated_user_pwd
            })
        }).then(
            res => res.json()
        ).then(res => {
            alert("User Updated Successfully");
        });
    }

    const deleteUser = (id) => {
        fetch("http://localhost:5000/deleteuser/" + id,{
            method:"DELETE",          
            
        }).then(
            res => res.json()
        ).then(res => {
            alert("User Deleted Successfully")         
           
        });
        // navigate("/home");
        
    }
    return(
        <>
        <h2>Listing Users: </h2>
        <Link to="/home">Home</Link>

                <table id="users-table">
                    <thead>
                        <tr> 
                            <th>Id</th>                           
                            <th>Email</th>
                            <th>Password</th>
                            <th>Update</th>
                            <th>Delete</th>
                        </tr>
                    </thead>
                    <tbody>
                        {users_data.map((user) => (
                            <tr>
                                <td>{user._id}</td>
                                <td><input type='text' defaultValue={user.email} onChange={(e) => setUpdateEmail(e.target.value)}/></td>
                                <td><input type='text' defaultValue={user.password} onChange={(e) => setUpdatePassword(e.target.value)}/></td>
                                <td><button onClick={() => updateUser(user._id)}>Update</button></td>
                                <td><button onClick={() => deleteUser(user._id)}>Delete</button></td>
                            </tr>
                        ))}
                    </tbody>                   
                </table>

        </>
    )
}

export default UsersList