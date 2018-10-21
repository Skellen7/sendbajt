import React, {Component} from 'react';
import MenuExamplePointing from "./MenuExamplePointing";
import howItWorksImage from '../assets/howItWorksImage.png';

const HowItWorks = () => {
    return (
        <div className="container">
            <MenuExamplePointing/>
            <img id="howItWorksImage" src={howItWorksImage}/>
            <p id="howItWorksHeader">
                <h1>How it works</h1>
            </p>
            <p></p>
            <p>
                <h3 id="howItWorksText">
                    “Imagine a situation... 4 pm, you're laying on a sofa watching your favourite Netflix TV series.
                    Suddenly, a phone rings. Thought it's really hard to move your arm, you answer the phone. "Did you
                    take out the trash, honey?" "Of course, sunshine" - you answer, looking at te pile of garbage laying
                    next to the door. If only something could save you from your misery... Oh wait! A few taps on a
                    phone and you get rid of your stinky problem!

                    Imagine another situation. You're young, full of energy and your friend invites you to a party. And
                    SHE will be there! But, you look at your wallet and oh boy! It's empty! If only something could save
                    you from your misery... Oh wait! A few taps on a phone and you can earn some extra bucks. All you
                    have to do is to take out your lazy neighbour's trash while taking away yours.”

                    Nowadays, you return home in the evening with Lyft drivers, food is brought to you by uberEats
                    deliveryman, so why couldn’t we go a step further? Why not pass other boring and tiring tasks to
                    people who want to earn some extra money?
                    With this idea in mind, we came up with an idea - platform to easily connect people who want to have
                    something done with people who can do it! That’s how Taskiro was born!

                    Taskiro is a responsive web-app build on React and Spring. With just a few clicks you can add some
                    task to be done. Our algorithm shows you suggested price based on other tasks in neighbourhood and
                    number of users currently doing tasks.
                    Of course, this is not final price - if you want you can change it up or down but remember -> if
                    your price is under the average it won’t be attractive for Taskiro users and your task may not be
                    done in the first place. On the other side, if you want to have task done immediately, you can go
                    with the price a bit up, and you can be sure, Taskirio users will do it momentarily.
                    Are you worried whether your task will be done? Don’t worry -> rating system ensures you, that task
                    will be done by trusted person. After every task money transaction both you and task doner will be
                    asked if the task was really done and to rate compliance of the task with its description and
                    quality of the task performed. And if you're on the other side of the fence, there is no limit of
                    markers on the map. Just describe your task, specify salary and wait for the response. And few hours
                    later you can enjoy your freshly mowed lawn. You want to have somebody doing your tasks everyday? No
                    problem! Just check box!
                </h3>
            </p>
            <p></p>
            <p></p>
            <p></p>
            <h1 style={{ marginLeft: 200, marginTop: 100 }}>1. Add task to done</h1>
            <h3 style={{ marginLeft: 200 }}>Choose place and convinient time</h3>
            <p></p>
            <p></p>
            <p></p>
            <h1 style={{ marginLeft: 200 }}>2. Somebody does it for you</h1>
            <h3 style={{ marginLeft: 200 }}>One of Taskiro users do the task</h3>
            <p></p>
            <p></p>
            <p></p>
            <h1 style={{ marginLeft: 200 }}>3. Pay and rate</h1>
            <h3 style={{ marginLeft: 200, marginBottom: 100 }}>Rate your service and pay for having task done</h3>
        </div>
    );
};

export default HowItWorks;