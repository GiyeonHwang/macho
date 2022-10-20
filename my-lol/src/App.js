import React from 'react'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Main from "./page/Main";
import Login from "./page/Login";
import Navigate from "./component/Navigate";
import PostMain from './page/post/PostMain';
import PostView from './page/post/PostView';
function App() {
  return (
        <BrowserRouter>
            <Navigate/>

            <Routes>
                <Route path="/" element={<Main />}></Route>
                <Route path="/Login" element={<Login />}></Route>

                {/*<Route exact path='/postView/:no' component={PostView} />*/}
                {/*<Route exact path='/postView' component={PostMain} />*/}

            </Routes>

        </BrowserRouter>

  );
}

export default App;

