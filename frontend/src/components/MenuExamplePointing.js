import React, { Component } from 'react'
import {Menu} from 'semantic-ui-react'

export default class MenuExamplePointing extends Component {
    state = { activeItem: 'map' }

    handleItemClick = (e, { name }) => this.setState({ activeItem: name })

    render() {
        const { activeItem } = this.state

        return (
            <div>
                <Menu id="menu" pointing>
                    <img id="logo" src={require('../assets/logos/logo_white.png')}></img>
                    <Menu.Item id="bigItem" name='map' active={activeItem === 'map'} onClick={this.handleItemClick} />
                    <Menu.Item id="bigItem"
                        name='how it works'
                        active={activeItem === 'how it works'}
                        onClick={this.handleItemClick}
                    />
                    <Menu.Item id="bigItem"
                        name='start earning'
                        active={activeItem === 'start earning'}
                        onClick={this.handleItemClick}
                    />
                    <Menu.Item id="bigItem"
                        name='contact'
                        active={activeItem === 'contact'}
                        onClick={this.handleItemClick}
                    />
                </Menu>
            </div>
        )
    }
}