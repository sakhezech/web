import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import GradientBackground from './components/GradientBackground';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import MainPage from './pages/mainpage/mainpage';
import Pronunciation from './pages/pronunciation/pronunciation';
import TextBackground from './components/TextBackground';

const root = ReactDOM.createRoot(
    document.getElementById('root') as HTMLElement
);
        
root.render(
    <div>
        <GradientBackground/>
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<MainPage/>}/>
                <Route path='/pronunciation' element={<Pronunciation/>}/>
            </Routes>
        </BrowserRouter>
        <TextBackground/>
    </div>
);
