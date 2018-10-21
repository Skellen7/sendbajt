import React, {Component} from 'react';
import './App.css';
import badBroom from './assets/icons/bad_broom.png'
import { googleMapsConfig } from "./config/googleMapsConfig";
import $ from 'jquery'
import {BrowserRouter, Route, Switch} from 'react-router-dom';
import HowItWorks from './components/HowItWorks';
import StartEarning from './components/StartEarning';
import Contact from './components/Contact';
import Map from './components/Map';
import Circular from "./components/Circular";
import ModalDimmer from "./components/ModalDimmer";
import mediumCar from "./assets/icons/medium_car.png";
import goodLawn from "./assets/icons/good_lawn.png";
import badDog from "./assets/icons/bad_dog.png";
import mediumLeaf from "./assets/icons/medium_leaf.png";
import badSnow from "./assets/icons/bad_snow.png";
import goodTrash from "./assets/icons/good_trash.png";



class App extends Component {
    componentDidMount() {
        this.renderMap();
    }

    renderMap = () => {
        loadScript(`https://maps.googleapis.com/maps/api/js?key=${googleMapsConfig}&callback=initMap`);
        window.initMap = this.initMap
    };

    initMap = () => {
        let map = new window.google.maps.Map(document.getElementById('map'), {
            center: {lat: 52.2296756, lng: 21.012228700000037},
            zoom: 14
        });

        let badBroomIcon = {
            url: badBroom,
            scaledSize: new window.google.maps.Size(37, 50),
        };

        let mediumCarIcon = {
            url: mediumCar,
            scaledSize: new window.google.maps.Size(37, 50),
        };
        let goodLawnIcon = {
            url: goodLawn,
            scaledSize: new window.google.maps.Size(37, 50),
        };
        let badDogIcon = {
            url: badDog,
            scaledSize: new window.google.maps.Size(37, 50),
        };
        let mediumLeafIcon = {
            url: mediumLeaf,
            scaledSize: new window.google.maps.Size(37, 50),
        };
        let badSnowIcon = {
            url: badSnow,
            scaledSize: new window.google.maps.Size(37, 50),
        };
        let goodTrashIcon = {
            url: goodTrash,
            scaledSize: new window.google.maps.Size(37, 50),
        };


        var contentString1 = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >'+
            '<div id="user_box">'+
            '<div id="user_desc">User</div>'+
            '<div id="user">towelchorizo21</div>'+
            '</div>'+

            '<div id="rating_box">'+
            '<div id="rating_desc">Rate</div>'+
            '<div id="rating">*****</div>'+
            '</div>'+
            '<div style="clear: both"></div>'+
            '<div id="line"> <hr/></div>'+
            '<div id="description_desc">Description</div>'+
            '<div id="description">I broke my leg and I need someone to do my shopping. Who\'s got time?</div>'+
            '<div id="price">17 $</div>'+
            '<div id="button"><a href="#" class="myButton">Accept</a></div>'+

            '</div>';

        var contentString2 = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >'+
            '<div id="user_box">'+
            '<div id="user_desc">User</div>'+
            '<div id="user">mayne$tle/div>'+
            '</div>'+

            '<div id="rating_box">'+
            '<div id="rating_desc">Rate</div>'+
            '<div id="rating">****</div>'+
            '</div>'+
            '<div style="clear: both"></div>'+
            '<div id="line"> <hr/></div>'+
            '<div id="description_desc">Description</div>'+
            '<div id="description">I need my lawn mowed.</div>'+
            '<div id="price">15 $</div>'+
            '<div id="button"><a href="#" class="myButton">Accept</a></div>'+

            '</div>';

        var contentString3 = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >'+
            '<div id="user_box">'+
            '<div id="user_desc">User</div>'+
            '<div id="user">13quaintjeer</div>'+
            '</div>'+

            '<div id="rating_box">'+
            '<div id="rating_desc">Rate</div>'+
            '<div id="rating">***</div>'+
            '</div>'+
            '<div style="clear: both"></div>'+
            '<div id="line"> <hr/></div>'+
            '<div id="description_desc">Description</div>'+
            '<div id="description">My car got dirty on my last journey. I need someone with a driver license to drive it to a car wash.</div>'+
            '<div id="price">17 $</div>'+
            '<div id="button"><a href="#" class="myButton">Accept</a></div>'+

            '</div>';

        var contentString4 = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >'+
            '<div id="user_box">'+
            '<div id="user_desc">User</div>'+
            '<div id="user">kasakinoriaki</div>'+
            '</div>'+

            '<div id="rating_box">'+
            '<div id="rating_desc">Rate</div>'+
            '<div id="rating">*****</div>'+
            '</div>'+
            '<div style="clear: both"></div>'+
            '<div id="line"> <hr/></div>'+
            '<div id="description_desc">Description</div>'+
            '<div id="description">Hi there! My mother in law visited me and I need someone to take out her lovely dog on a walk :)</div>'+
            '<div id="price">17 $</div>'+
            '<div id="button"><a href="#" class="myButton">Accept</a></div>'+

            '</div>';

        var contentString5 = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >'+
            '<div id="user_box">'+
            '<div id="user_desc">User</div>'+
            '<div id="user">selfieself12</div>'+
            '</div>'+

            '<div id="rating_box">'+
            '<div id="rating_desc">Rate</div>'+
            '<div id="rating">*****</div>'+
            '</div>'+
            '<div style="clear: both"></div>'+
            '<div id="line"> <hr/></div>'+
            '<div id="description_desc">Description</div>'+
            '<div id="description">I broke my leg and I need someone to do my shopping. Who\'s got time?</div>'+
            '<div id="price">17 $</div>'+
            '<div id="button"><a href="#" class="myButton">Accept</a></div>'+

            '</div>';

        var contentString6 = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >'+
            '<div id="user_box">'+
            '<div id="user_desc">User</div>'+
            '<div id="user">griMMass</div>'+
            '</div>'+

            '<div id="rating_box">'+
            '<div id="rating_desc">Rate</div>'+
            '<div id="rating">*****</div>'+
            '</div>'+
            '<div style="clear: both"></div>'+
            '<div id="line"> <hr/></div>'+
            '<div id="description_desc">Description</div>'+
            '<div id="description">Hello! The last snowstorm blocked my door and I\'m unable to leave my house. If someone could clear my house of snow, I\'d be grateful!</div>'+
            '<div id="price">17 $</div>'+
            '<div id="button"><a href="#" class="myButton">Accept</a></div>'+

            '</div>';

        var infowindow1 = new window.google.maps.InfoWindow({
            content: contentString1
        });

        var marker1 = new window.google.maps.Marker({
            position: {lat: 52.2196756, lng: 21.012228700000037},
            map: map,
            icon: badBroomIcon,
            title: ''
        });
        marker1.addListener('click', function() {
            infowindow1.open(map, marker1);
        });

        window.google.maps.event.addListener(map, 'click', function() {
            infowindow1.close();
        });

        window.google.maps.event.addListener(infowindow1, 'domready', function() {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color","#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

        var infowindow2 = new window.google.maps.InfoWindow({
            content: contentString2
        });

        var marker2 = new window.google.maps.Marker({
            position: {lat: 52.239094, lng: 20.985423},
            map: map,
            icon: mediumCarIcon,
            title: ''
        });
        marker2.addListener('click', function() {
            infowindow2.open(map, marker2);
        });

        window.google.maps.event.addListener(map, 'click', function() {
            infowindow2.close();
        });

        window.google.maps.event.addListener(infowindow2, 'domready', function() {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color","#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

        var infowindow3 = new window.google.maps.InfoWindow({
            content: contentString3
        });

        var marker3 = new window.google.maps.Marker({
            position: {lat: 52.234026, lng: 20.986651},
            map: map,
            icon: goodLawnIcon,
            title: ''
        });
        marker3.addListener('click', function() {
            infowindow3.open(map, marker3);
        });

        window.google.maps.event.addListener(map, 'click', function() {
            infowindow3.close();
        });

        window.google.maps.event.addListener(infowindow3, 'domready', function() {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color","#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

        var infowindow4 = new window.google.maps.InfoWindow({
            content: contentString4
        });

        var marker4 = new window.google.maps.Marker({
            position: {lat: 52.233203, lng: 20.981341},
            map: map,
            icon: mediumLeafIcon,
            title: ''
        });
        marker4.addListener('click', function() {
            infowindow4.open(map, marker4);
        });

        window.google.maps.event.addListener(map, 'click', function() {
            infowindow4.close();
        });

        window.google.maps.event.addListener(infowindow4, 'domready', function() {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color","#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

        var infowindow5 = new window.google.maps.InfoWindow({
            content: contentString5
        });

        var marker5 = new window.google.maps.Marker({
            position: {lat: 52.236810, lng: 20.987640},
            map: map,
            icon: badSnowIcon,
            title: ''
        });
        marker5.addListener('click', function() {
            infowindow5.open(map, marker5);
        });

        window.google.maps.event.addListener(map, 'click', function() {
            infowindow5.close();
        });

        window.google.maps.event.addListener(infowindow5, 'domready', function() {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color","#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

        var infowindow6 = new window.google.maps.InfoWindow({
            content: contentString6
        });

        var marker6 = new window.google.maps.Marker({
            position: {lat: 52.231434, lng: 20.968902},
            map: map,
            icon: goodTrashIcon,
            title: ''
        });
        marker6.addListener('click', function() {
            infowindow6.open(map, marker6);
        });

        window.google.maps.event.addListener(map, 'click', function() {
            infowindow6.close();
        });

        window.google.maps.event.addListener(infowindow6, 'domready', function() {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color","#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

        var contentString = '<div id="content" style="width: 400px; margin: 15px; color: #fff;" >' +
            '<div id="user_box">' +
            '<div id="user_desc">Użytkownik</div>' +
            '<div id="user">cichyzbyszek59</div>' +
            '</div>' +

            '<div id="rating_box">' +
            '<div id="rating_desc">Ocena</div>' +
            '<div id="rating">*****</div>' +
            '</div>' +
            '<div style="clear: both"></div>' +
            '<div id="line"> <hr/></div>' +
            '<div id="description_desc">Opis</div>' +
            '<div id="description">Mam do wyniesienia koło trzech worków śmieci. Nie sa duze, a klucz do smieci wrzucam pod wycieraczke</div>' +
            '<div id="price">17 zł</div>' +
            '<div id="button"><a href="#" class="myButton">Przyjmij</a></div>' +

            '</div>';


    };

    render() {
        return (
            <BrowserRouter>
                <div className="container">
                <Switch>
                    <Route exact path="/" component={Map} />
                    <Route exact path="/howitworks" component={HowItWorks}/>
                    <Route exact path="/startearning" component={StartEarning}/>
                    <Route path="/contact" component={Contact}/>
                </Switch>
                </div>
                {/*<div id="circular">*/}
                    {/*<ModalDimmer/>*/}
                {/*</div>*/}
            </BrowserRouter>
        );
    }
}

function loadScript(url) {
    var index = window.document.getElementsByTagName("script")[0];
    var script = window.document.createElement("script");
    script.src = url;
    script.async = true;
    script.defer = true;
    index.parentNode.insertBefore(script, index)
}

export default App;
