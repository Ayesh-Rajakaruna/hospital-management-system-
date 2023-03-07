import  {React, useState, useEffect} from 'react'
import './HistoryOfThePatiencss.css'

function UncontrolledExample() {
  const [Patientdetails, setPatientdetails] = useState([]);
    useEffect(() => {
      fetch('http://localhost:8082/api/v1/MedicalHistory/get')
      .then((response) => response.json())
      .then(data => setPatientdetails(data));;
    }, []);

  return ( 
    <div>
      <div className="Topic_Box">
        <h1>Histry Of Pation</h1>
      </div>
      <div className="Table_Box">
        <table>
          <thead>
            <tr>
              <th>Patient Id</th>
              <th>Date</th>
              <th>Small Description</th>
              <th>Quantity</th>
            </tr>
          </thead>
          <tbody>
            {Patientdetails.map((row, rowIndex) => (
              <tr key={rowIndex}>
                <td className="Patient_Id">{row.patientIdForMedicalHistory}</td>
                <td className="Date">{row.date}</td>
                <td className="Small_Description">{row.smallDescription}</td>
                <td className="Quantity">{row.quantity}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div> 
  );
}
export default UncontrolledExample;