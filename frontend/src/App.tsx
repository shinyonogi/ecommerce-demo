import React from 'react';
import { motion } from 'framer-motion';

import './App.css';
import Header from './components/main/header';
import SecondHeader from './components/main/secondheader';


function App() {
  return (
    <div className="App">
      <Header />
      <SecondHeader />
    </div>
  );
}

export default App;
