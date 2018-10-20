import React from 'react'
import { Button, Header, Image, Modal, Input, Label } from 'semantic-ui-react'
import JobType from "./JobType";
import GoogleSuggests from "./GoogleSuggests"

const ModalDimmer = () => (
    <Modal trigger={<Button circular icon='plus' />}>
        <Modal.Header>Add your job</Modal.Header>
        <Modal.Content>
            <Header>Job type:</Header>
            <JobType/>
            <Header>Description:</Header>
            <Input placeholder='Description' />
            <Header>Salary:</Header>
            <Input labelPosition='right' type='text' placeholder='Amount'>
                <Label basic>$</Label>
                <input />
                <Label>.00</Label>
            </Input>
            <Header>Localization:</Header>
            <GoogleSuggests/>
        </Modal.Content>
        <Modal.Actions>
            <Button negative>Go back</Button>
            <Button positive icon='checkmark' labelPosition='right' content='Add job' />
        </Modal.Actions>
    </Modal>
)

export default ModalDimmer