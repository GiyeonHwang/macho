import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Main from "./page/Main";
import Login from "./page/Login";
import Navigate from "./component/Navigate";
import Sign from "./page/Sign";


function App() {
  return (
    <div >
        <BrowserRouter>
            <Navigate/>
            <Routes>
                <Route path="/" element={<Main />}></Route>
                <Route path="/Login" element={<Login />}></Route>
                <Route path="/Sign" element={<Sign />}></Route>

            </Routes>
        </BrowserRouter>
    </div>
  );
}

export default App;
