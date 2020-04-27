import React from "react";
import {Form,Button,Card,Col} from 'react-bootstrap';
import GoogleLogin from 'react-google-login';
import FaceBookLogin from 'react-facebook-login';

const responseGoogle = (response) => {
    console.log(response);
}

class Login extends React.Component{



    constructor (props) {
        super(props);
        this.state = {
            username: '',
            password: '',

        }
        this.loginChange=this.loginChange.bind(this);
        this.submitLogin=this.submitLogin.bind(this);
    }

    submitLogin(event){
       alert("Jesteś zalohowany");

        event.preventDefault();
    }



    loginChange(event){
        this.setState({
            [event.target.name]:event.target.value
        });

    }



    render() {
        return(
            <Card className={"border border-dark bg-dark text-white"}>
                <Card.Header>Login</Card.Header>
                <form onSubmit={this.submitLogin} id={"loginId"}>
                    <Card.Body>

                        <Form.Row>
                            <Form.Group as={Col} controlId="formGridEmail">
                                <Form.Label>Username (email)</Form.Label>
                                <Form.Control required
                                              className={"bg-dark text-white"}
                                              id="username"
                                              name={"username"}
                                              value={this.state.username}
                                              onChange={this.loginChange}
                                              type="email"
                                              placeholder="Enter email" />

                            </Form.Group>
                        </Form.Row>


                        <Form.Row>
                            <Form.Group as={Col} controlId={"fromGridPass"}>
                                <Form.Label>Password</Form.Label>
                                <Form.Control required
                                              className={"bg-dark text-white"}
                                              id="password"
                                              name={"password"}
                                              value={this.state.password}
                                              onChange={this.loginChange}
                                              type="password"
                                              placeholder="Password" />
                            </Form.Group>
                        </Form.Row>



                    </Card.Body>
                    <Card.Footer style={{"textAlign":"right"}}>
                        <Button size={"sm"} variant="success" type="submit">
                            Submit
                        </Button>
                    </Card.Footer>
                </form>

            </Card>
        );
    }

}

export default Login;