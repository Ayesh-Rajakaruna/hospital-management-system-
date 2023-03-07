import PatientRegisterPage from './Pages/PatientRegisterPage.jsx'
import PatientLoging from './Pages/PatientLoging.jsx'
import PationBodyPage from './Pages/PationBodyPage'

import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<PationBodyPage/>}/>
        <Route path="Homepage" element={<PationBodyPage/>} />
        <Route path="PatientRegisterPage" element={<PatientRegisterPage/>}/>
        <Route path="PatientLoging" element={<PatientLoging/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
