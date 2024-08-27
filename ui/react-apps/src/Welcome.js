function formatUser(user){
    return(
        <p>FirstName is {user.firstName} and 
            lastName is {user.lastName}
        </p>
    )
}
const user = {
    firstName:'John',
    lastName:'Doe'
}
function Welcome(){
    return(
        <>
            <h2>Welcome Component</h2>
            {formatUser(user)}
        </>
    )
}

export default Welcome