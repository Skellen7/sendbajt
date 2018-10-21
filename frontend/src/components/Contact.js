import React, {Component} from 'react';
import MenuExamplePointing from "./MenuExamplePointing";
import contactImage from '../assets/contact.jpg';

const Contact = () => {
    return (
        <div className="container">
            <MenuExamplePointing/>
            <img id="startEarningImage" src={contactImage}/>
            <p id="howItWorksHeader">
                <h1 style={{ marginLeft: 70 }}>Contact</h1>
            </p>
            <p></p>
            <p>
                <h3 id="howItWorksText" style={{ marginLeft: 150, marginBottom: 100 }}>
                    If you have some questions about the app or about the way you can add tasks / earn money. Do not hesitate to contact us!
                </h3>
            </p>
        </div>
    );
};

export default Contact;
