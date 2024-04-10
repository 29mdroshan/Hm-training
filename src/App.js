import logo from './logo.svg';
import './App.css';
import MusicForm from './components/MusicForm';
import Header from './components/header/Header';
import ViewMusic from './components/viewMusic/ViewMusic';
import { Route, Routes } from 'react-router-dom';
import Home from './components/home/Home';
import Footer from './components/footer/Footer';
import ErrorPage from './components/error/ErrorPage';



function App() {
  return (
    <div className="App">
      <Header></Header>
      <div className='main col-12'>
        <Routes>
          <Route path='' element={<Home></Home>}></Route>
          <Route path='/add-album' element={<MusicForm></MusicForm>}></Route>
          <Route path='/view-album' element={<ViewMusic></ViewMusic>}></Route>
         
          <Route path='/*' element={<ErrorPage></ErrorPage>}></Route>
        </Routes>
      </div>
      <Footer></Footer>
      
      {/* <MusicForm></MusicForm> */}
      {/* <ViewMusic></ViewMusic> */}
    </div>
  );
}

export default App;
