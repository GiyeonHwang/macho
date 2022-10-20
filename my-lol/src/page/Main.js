import TopBox from '../component/Header';
import { Link } from 'react-router-dom';
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import React from "react";
import styled from 'styled-components';

function Main(){
    //광고 페이지네이션
    return(
        <>
            <br/>
            <Imagecontent>
                <img src='/img/main1.png' />
            </Imagecontent>

            <Searchbar>
                <Form className="d-flex" >
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <Form.Control
                        type="search"
                        placeholder="소환사명"
                        className="me-2"
                        aria-label="Search"

                    />
                    <Button >.GG</Button>

                </Form>
            </Searchbar>



        </>
    )
}
export default Main;

let Searchbar = styled.div`
  left: 40px;
  width : 80%;
  justify-content: center;
`

let Imagecontent = styled.div`
  display: flex;
  width : 100%;
  justify-content: center;
  align-items: center;
`
