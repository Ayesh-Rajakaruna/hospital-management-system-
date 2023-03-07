import React from 'react'
import './navbar.css'
export default function navbar() {
  return (
    <div>
        <div className='Navbar'>
            <div className="Logo">
            <h1>Yapa Hospital</h1>
            </div>
            <div className="NavbarList">
                <ul>
                    <li><a href="Homepage">HOME</a></li>
                    <li><a href="">DOCTOR</a></li>
                    <li><a href="PatientLoging">PATIENT</a></li>
                    <li><a href="">ADMIN</a></li>
                    <li><a href="">CONTACT</a></li>
                    <li><a href="">LOGING</a></li>
                </ul>
            </div>
        </div>
    </div>
  )
}
