import React from "react";
import {Form,Button,Card,Col} from 'react-bootstrap';

class Login extends React.Component{

    constructor (props) {
        super(props);
        this.state = {
            email: '',
            password: '',

        }
        this.passChange=this.passChange.bind(this);
        this.submitPassword=this.submitPassword.bind(this);
    }

    submitPassword(event){
       alert("Hasła są identyczne");

        event.preventDefault();
    }

    passChange(event){
        this.setState({
            [event.target.name]:event.target.value
        });

    }

    render() {
        return(
            <Card className={"border border-dark bg-dark text-white"}>
                <Card.Header>Register</Card.Header>
                <form onSubmit={this.submitPassword} id={"changePassordId"}>
                    <Card.Body>
                        <Form.Row>
                            <Form.Group as={Col} controlId="formGridEmail">
                                <Form.Label>Email address</Form.Label>
                                <Form.Control required
                                              className={"bg-dark text-white"}
                                              name={"email"}
                                              value={this.state.email}
                                              onChange={this.passChange}
                                              type="email"
                                              placeholder="Enter email" />

                            </Form.Group>
                        </Form.Row>


                        <Form.Row>
                            <Form.Group as={Col} controlId={"fromGridPass"}>
                                <Form.Label>Password</Form.Label>
                                <Form.Control required
                                              className={"bg-dark text-white"}
                                              name={"password"}
                                              value={this.state.password}
                                              onChange={this.passChange}
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