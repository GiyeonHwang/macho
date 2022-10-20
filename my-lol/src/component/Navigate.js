import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import 'bootstrap/dist/css/bootstrap.min.css';
import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";
import Form from "react-bootstrap/Form";
import React, {useState} from "react";
import Container from 'react-bootstrap/Container';

function Navigate() {
    const [show, setShow] = useState(false);

    const [show2, setShow2] = useState(false);

    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);

    const handle2Close = () => setShow2(false);
    const handle2Show = () => setShow2(true);


    return (
        <>
            <Navbar bg="light" expand="lg" >
                <Container fluid>
                    <Navbar.Brand href="#">MACHO.GG</Navbar.Brand>
                    <Navbar.Toggle aria-controls="navbarScroll" />
                    <Navbar.Collapse id="navbarScroll">
                        <Nav
                            className="me-auto my-2 my-lg-0"
                            style={{ maxHeight: '100px' }}
                            navbarScroll
                        >
                            <Nav.Link href="/">홈</Nav.Link>
                            <Nav.Link href="/">챔피언 분석</Nav.Link>
                            <Nav.Link href="#action2">멀티서치</Nav.Link>
                            <Nav.Link href="/postView">커뮤니티</Nav.Link>
                            <Nav.Link href="#action2">유저신고</Nav.Link>
                            {/*<NavDropdown title="Link" id="navbarScrollingDropdown">*/}
                            {/*    <NavDropdown.Item href="#action3">Action</NavDropdown.Item>*/}
                            {/*    <NavDropdown.Item href="#action4">*/}
                            {/*        Another action*/}
                            {/*    </NavDropdown.Item>*/}
                            {/*    <NavDropdown.Divider />*/}
                            {/*    <NavDropdown.Item href="#action5">*/}
                            {/*        Something else here*/}
                            {/*    </NavDropdown.Item>*/}
                            {/*</NavDropdown>*/}
                        </Nav>
                        {/*<Form className="d-flex">*/}
                        {/*    <Form.Control*/}
                        {/*        type="search"*/}
                        {/*        placeholder="소환사명"*/}
                        {/*        className="me-2"*/}
                        {/*        aria-label="Search"*/}
                        {/*    />*/}
                        {/*    <Button variant="outline-success">Search</Button>*/}
                        {/*</Form>*/}
                        &nbsp; &nbsp;
                        <Button variant="primary" onClick={handleShow} >
                            로그인
                        </Button>
                    </Navbar.Collapse>
                </Container>
            </Navbar>




    <>


        <Modal
            show={show}
            onHide={handleClose}
            backdrop="static"
            keyboard={false}
        >

            <Modal.Header closeButton>
                <Modal.Title>로그인</Modal.Title>
            </Modal.Header>
            <Modal.Body>
                <Form>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>아이디</Form.Label>
                        <Form.Control type="text" placeholder="id" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>패스워드</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicCheckbox">
                        <Form.Check type="checkbox" label="아이디 저장" />
                    </Form.Group>
                    <Button variant="primary" type="submit">
                        Submit
                    </Button>


                </Form>

            </Modal.Body>
            <Modal.Footer>
                <Button variant="secondary" onClick={handleClose}>
                    Close
                </Button>
                <Button variant="primary" type="button" onClick={handle2Show} >회원가입</Button>
            </Modal.Footer>
        </Modal>

        <Modal
            show={show2}
            onHide={handle2Close}
            backdrop="static"
            keyboard={false}
        >

            <Modal.Header closeButton>
                <Modal.Title>회원가입</Modal.Title>
            </Modal.Header>
            <Modal.Body>
                <Form>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>아이디</Form.Label>
                        <Form.Control type="text" placeholder="id" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>패스워드</Form.Label>
                        <Form.Control type="password" placeholder="Password" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicEmail">
                        <Form.Label>이메일</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" />
                        <Form.Text className="text-muted">
                            이메일 공유가 안됩니다.
                        </Form.Text>
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>닉네임</Form.Label>
                        <Form.Control type="text" placeholder="Nickname" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>휴대폰</Form.Label>
                        <Form.Control type="text" placeholder="Phone Number Ex) 01012345678" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicPassword">
                        <Form.Label>생년월일</Form.Label>
                        <Form.Control type="text" placeholder="Brith Ex) 000522" />
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="formBasicCheckbox">
                        <Form.Check type="checkbox" label="아이디 저장" />
                    </Form.Group>
                    <Button variant="primary" type="submit">
                        Submit
                    </Button>


                </Form>

            </Modal.Body>
            <Modal.Footer>
                <Button variant="secondary" onClick={handle2Close}>
                    Close
                </Button>
            </Modal.Footer>
        </Modal>
    </>
</>



);
}

export default Navigate;