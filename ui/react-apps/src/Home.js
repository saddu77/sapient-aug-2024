import React from 'react';
import { Container, Row, Col, Button } from 'react-bootstrap';
import { Link ,useNavigate} from 'react-router-dom';

const HomePage = () => {

  const navigate = useNavigate();  
  const signout = () => {
    navigate("/");
  }
  
  return (
   <>
   <h2>Welcome to HomePage</h2>
   <ul>
    <li><Link to="/home">Home</Link></li>
    <Link to="/users">Users</Link>
    <li>Module3</li>
   </ul>
   {/* <Link id="link" to="/">Logout</Link> */}
   <Button onClick={signout}>Logout</Button>
   </>
  );
};

export default HomePage;
