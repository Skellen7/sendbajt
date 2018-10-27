import React from 'react'
import { Image, List } from 'semantic-ui-react'

class ListExampleCelled extends React.Component {
    constructor(props) {
        super(props);
    }

    handleCheck(e) {
        alert(e.target);
    }

    render() {
        return (
        <List celled>
            <List.Item onClick={this.handleCheck}>
                <Image avatar src={require('../assets/icons/dollarIconDark.png')} />
                <List.Content>
                    <List.Header>H&M Zakupy</List.Header>
                    200.00$
                </List.Content>
            </List.Item>
            <List.Item>
                <Image avatar src={require('../assets/icons/dollarIconDark.png')} />
                <List.Content>
                    <List.Header>McDonald Szewska 2</List.Header>
                    15.20$
                </List.Content>
            </List.Item>
            <List.Item>
                <Image avatar src={require('../assets/icons/dollarIconDark.png')} />
                <List.Content>
                    <List.Header>Atm Rynek Główny 20</List.Header>
                    500.00$
                </List.Content>
            </List.Item>
        </List>
        )
    }
}


export default ListExampleCelled