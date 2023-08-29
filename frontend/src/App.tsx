import React from 'react';
import { motion } from 'framer-motion';

import './App.css';
import Navbar from './components/navbar'
import Header from './components/main/header';


function App() {
  return (
    <div className="App">
      <Navbar />
      <Header />
    </div>
  );
}

export default App;
