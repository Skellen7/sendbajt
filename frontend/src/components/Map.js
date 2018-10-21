import React, {Component} from 'react';
import '../App.css';
import badBroom from '../assets/icons/bad_broom.png'
import {googleMapsConfig} from "../config/googleMapsConfig";
import $ from 'jquery'
import ModalDimmer from "../components/ModalDimmer";
import MenuExamplePointing from "../components/MenuExamplePointing";

class Map extends Component {
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
        let badBroomMarker = new window.google.maps.Marker({
            position: {lat: 52.2296756, lng: 21.012228700000037},
            map: map,
            icon: badBroomIcon
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

        var infowindow = new window.google.maps.InfoWindow({
            content: contentString
        });

        var marker = new window.google.maps.Marker({
            position: {lat: 52.2196756, lng: 21.012228700000037},
            map: map,
            icon: badBroomIcon,
            title: ''
        });
        marker.addListener('click', function () {
            infowindow.open(map, marker);
        });

        window.google.maps.event.addListener(map, 'click', function () {
            infowindow.close();
        });

        window.google.maps.event.addListener(infowindow, 'domready', function () {

            var iwOuter = $('.gm-style-iw');
            iwOuter.css("background-color", "#9AC33C")

            var iwBackground = iwOuter.prev();

            // Removes background shadow DIV
            iwBackground.children(':nth-child(2)').css({'display': 'none'});

            // Removes white background DIV
            iwBackground.children(':nth-child(4)').css({'display': 'none'});
        });

    };

    render() {
        return (
            <main>
                <MenuExamplePointing/>
                <div id="map"></div>
                <div id="circular">
                    <ModalDimmer/>
                </div>
            </main>
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

export default Map;
