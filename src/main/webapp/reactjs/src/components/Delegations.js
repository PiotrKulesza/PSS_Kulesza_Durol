import React from "react";
import DateTimePicker from 'react-datetime-picker';
import {Card, Nav, Table} from "react-bootstrap";

class Delegations extends React.Component{

    render() {
        return (
            <Card className={"border border-dark bg-dark text-white"}>
                <Card.Header>Delegations  <Nav className="mr-auto"><Nav.Link href={"/adddelegation/"+this.props.match.params.userId}>Add</Nav.Link></Nav></Card.Header>
                <Card.Body>
                    <Table bordered hover striped variant={"dark"}>
                        <thead>
                        <tr>
                            <th>Id</th>
                            <th>UserId</th>
                            <th>Description</th>
                            <th>Start</th>
                            <th>Stop</th>
                            <th>Travel Diet</th>
                            <th>Breakfest Number</th>
                            <th>Dinder Number</th>
                            <th>Supper Number</th>
                            <th>Transport Type</th>
                            <th>Ticket Price</th>
                            <th>Auto Capacity</th>
                            <th>Km</th>
                            <th>Accomodation Price</th>
                            <th>Dinder Number</th>
                            <th>Other Tickets Price</th>
                            <th>Other Outlay Desc</th>
                            <th>Other Outlay Price</th>
                            <th>Edit</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colSpan="19">For now empty</td>
                        </tr>
                        </tbody>
                    </Table>
                </Card.Body>
            </Card>
        );
    }

}

export default Delegations;