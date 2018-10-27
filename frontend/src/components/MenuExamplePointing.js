import React, {Component} from 'react'
import {Menu} from 'semantic-ui-react'
import {Link} from 'react-router-dom';

export default class MenuExamplePointing extends Component {
    state = {activeItem: 'map'};

    componentDidMount() {
        if (this.state.activeItem == 'map') {
            this.setState({activeItem: ''})
        }
    }

    handleItemClick = (e, {name}) => this.setState({activeItem: name})

    render() {
        const {activeItem} = this.state;

        return (
            <div className="container">
                <Menu id="menu" pointing>
                    <img id="logo" src={require('../assets/logos/logo.png')}></img>
                    <Link to="/howitworks">
                        <Menu.Item id="bigItem"
                                   name='History overview'
                                   active={activeItem === 'how it works'}
                                   onClick={this.handleItemClick}
                        />
                    </Link>
                    <Link to="/startearning">
                        <Menu.Item id="bigItem"
                                   name='Back to account'
                                   active={activeItem === 'start earning'}
                                   onClick={this.handleItemClick}
                        />
                    </Link>
                </Menu>
            </div>
        )
    }
}