import React from 'react'
import { Grid, Image, Button, ButtonGroup, ButtonContent, Header } from 'semantic-ui-react'
import broomIcon from '../assets/icons/broom.png'
import carIcon from '../assets/icons/car.png'
import cartIcon from '../assets/icons/cart.png'
import dogIcon from '../assets/icons/dog.png'
import lawnIcon from '../assets/icons/lawn.png'
import leafIcon from '../assets/icons/leaf.png'
import snowIcon from '../assets/icons/snow.png'
import trashIcon from '../assets/icons/trash.png'

const JobType = () => (<div>
        <ButtonContent/>
        <Button >
            <img src={broomIcon}/>
        </Button>
        <Button >
            <img src={carIcon} />
        </Button>
        <Button >
            <img src={cartIcon}/>
        </Button>
        <Button >
            <img src={dogIcon}/>
        </Button>
        <Header></Header>
        <ButtonContent/>
        <Button >
            <img src={lawnIcon}/>
        </Button>
        <Button >
            <img src={leafIcon}/>
        </Button>
        <Button >
            <img src={snowIcon}/>
        </Button>
        <Button >
            <img src={trashIcon}/>
        </Button>
        <ButtonContent/>
    </div>
)

export default JobType