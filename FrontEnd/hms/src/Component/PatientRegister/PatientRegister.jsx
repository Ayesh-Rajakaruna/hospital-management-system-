import React, { useState } from "react";
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import "./PatientRegisterStyle.css"
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
    fetch('http://localhost:8082/api/v1/PatientInformation/save', {
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
      <h1>Patient Registration</h1>
        <Form onSubmit={handleSubmit}>
          <Form.Group className="mb-3" controlId="formBasicName">
            <Form.Label>Patient Name</Form.Label>
            <Form.Control type="Patient_Name" onChange={handleChange} name="patientName"/>
          </Form.Group>
          <Form.Group className="mb-3" controlId="formBasicAddress">
            <Form.Label>Patient Address</Form.Label>
            <Form.Control type="Patient_Address" onChange={handleChange} name="patientAddress"/>
          </Form.Group>
          <Form.Group className="mb-3" controlId="formBasicNumber">
            <Form.Label>Patient Contact Number</Form.Label>
            <Form.Control type="Patient_Contact_Number" onChange={handleChange} name="patientContactNumber"/>
          </Form.Group>
          <Form.Group className="mb-3" controlId="formBasicNic" >
            <Form.Label>Patient Nic</Form.Label>
            <Form.Control type="Patient_Nic" onChange={handleChange} name="patientNic"/>
          </Form.Group>
          <Form.Group className="mb-3" controlId="formBasicPassword" >
            <Form.Label>Patient Password</Form.Label>
            <Form.Control type="Patient_Password" onChange={handleChange} name="patientPassword"/>
          </Form.Group>
          <Button variant="primary" type="submit">
            Submit
          </Button>
        </Form>
      </div>
    </div>
  );
}

export default BasicExample;