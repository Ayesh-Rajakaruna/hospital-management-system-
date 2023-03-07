import  {React, useState, useEffect} from 'react'
import ReactDOM from 'react-dom';
import './PationPage.css'
import logo from '../../Img/NewIcon/images.png';
import HistoryOfThePatien from './HistoryOfThePatien/HistoryOfThePatien'
import PationEmpyBody from './HistoryOfThePatien/PationEmpyBody'

function UncontrolledExample() {

  const [ShowComponentHistory, setShowComponentHistory] = useState(false);
  const searshHistory = (event) => {
    setShowComponentHistory(!ShowComponentHistory);
  };
  
  return ( 
    <>
    <div className="Body_Of_Pation_Page">
      <div className="Item_box">
      <div className="sidebar">
        <div className="Image_Box">
          <div className="image_and_name">
            <img src={logo} alt="Logo" />
            <div className="Pation_name">
              <h6>Ayesh wimantha</h6>
            </div>
          </div>
        </div>
        <div className="TopicBox">
          <h6>MAIN NAVIGATION</h6>
        </div> 
      <div className="Item_list">
        <ul>
          <li><a onClick = {searshHistory}>history of the patient</a></li>
          <li><a href="#">Appointment</a></li>
          <li><a href="#">Clinical Details</a></li>
          <li><a href="#">Flute plane</a></li>
        </ul>
      </div>
      </div>
      </div>
      <div className="Body_Box">
        {ShowComponentHistory ? <HistoryOfThePatien /> : <PationEmpyBody />}
      </div>
    </div>
    </> 
  );
}
export default UncontrolledExample;