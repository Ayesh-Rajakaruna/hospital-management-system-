import React, { useState } from "react";
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import "./PatientRegisterStyle.css"
import "../../../node_modules/react-bootstrap/dist/react-bootstrap";
import "../../../node_modules/bootstrap/dist/css/bootstrap.css";
function BasicExample() {
  const [formData, setFormData] = useState();

  const handleChange = (event) => {
    setFormData({
      ...formData,
      [event.target.name]: event.target.value
    });
  };

  const handleSubmit = event => {
    event.preventDefault();
    console.log(formData);
    fetch('http://localhost:8082/api/v1/PatientInformation/Logging', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(formData)
  })
    .then(response => response.json())
    .then(data => {
      console.log('Success:', data);
    })
    .catch(error => {
      console.error('Error:', error);
    });
};

  return (
    <div className='FormDive'>
      <div className="FromAndTopic">
      <h1>Patient Loging</h1>
        <Form onSubmit={handleSubmit}>
          <Form.Group className="mb-3" controlId="formBasicNic" >
            <Form.Label>Patient Nic</Form.Label>
            <Form.Control type="Patient_Nic" onChange={handleChange} name="patientNic"/>
          </Form.Group>
          <Form.Group className="mb-3" controlId="formBasicPassword" >
            <Form.Label>Patient Password</Form.Label>
            <Form.Control type="Patient_Password" onChange={handleChange} name="patientPassword"/>
          </Form.Group>
          <Form.Text className="text-muted">
          <a href="PatientRegisterPage">I Dont have acount.</a>
          </Form.Text>
          <br></br>
          <br></br>
          <Button variant="primary" type="submit">
            Submit
          </Button>
        </Form>
      </div>
    </div>
  );
}

export default BasicExample;