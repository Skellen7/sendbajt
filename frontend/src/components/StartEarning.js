import React, {Component} from 'react';
import MenuExamplePointing from "./MenuExamplePointing";
import startEarning from '../assets/startEarning.jpg';

const StartEarning = () => {
    return (
        <div className="container">
            <MenuExamplePointing/>
            <img id="startEarningImage" src={startEarning}/>
            <p id="howItWorksHeader">
                <h1>Start Earning</h1>
            </p>
            <p></p>
            <p>
                <h3 id="howItWorksText" style={{ marginBottom: 100 }}>
                    Become Taskiro user and start earning extra money! Help other people doing their task and decide at
                    your own if you want to work today or not. Do you have free time? Stop wasting it watching tv series
                    and earn real money! Set up your own schedule, Adjust the work to your daily rhythm of the day.
                    Register and get in the way right now
                </h3>
            </p>
        </div>
    );
};

export default StartEarning;
