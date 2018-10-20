import React, {Component} from 'react';
import './App.css';
import badBroom from './assets/icons/bad_broom.png'
import { googleMapsConfig } from "./config/googleMapsConfig";

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
        let badBroomMarker = new window.google.maps.Marker({
            position: {lat: 52.2296756, lng: 21.012228700000037},
            map: map,
            icon: badBroomIcon
        });
    };

    render() {
        return (
            <main>
                <div id="map"></div>
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

export default App;
