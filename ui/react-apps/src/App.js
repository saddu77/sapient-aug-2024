
import './App.css';
import Home from './Home';
import Login from './Login';
import SignUp from './SignUp';
import UsersList from './UsersList';
import Welcome from './Welcome';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
// Functional Component
const name = "Alex";
const age = 23;
const msg = <h2>Name is {name} and age is {age}</h2>
function App() {
  return (
    <>
    {/* <h2>Welcome to React !!!!</h2>
    <p>This is my first React web page !!!</p>
    <h2>Welcome {name} </h2>
    {msg}
    <Welcome /> */}
    <Router>
      <Routes>
        <Route path="/" element={<Login />}></Route>
        <Route path="/login" element={<Login />}></Route>
        <Route path="/signup" element={<SignUp />}></Route>
        <Route path="/home" element={<Home />}></Route>
        <Route path="/users" element={<UsersList />}></Route>

      </Routes>
    </Router>
   
    </>
  );
}

export default App;
