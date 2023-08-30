import React from 'react';
import { easeIn, easeOut, motion } from 'framer-motion';

import './header.css';

import Navbar from '../navbar';

function Header() {
    return(
        <motion.div
            initial={{opacity: 0}}
            animate= {{opacity: 1}}
            transition={{ease: 'easeInOut', duration: 2}}
            className='header-container'
        >
            <Navbar />
            <motion.h1
                initial={{x : -800}}
                animate={{ x: 0}}
                transition={{ ease: "easeOut", duration: 2 }}
            >眠いんだにゃ。</motion.h1>
            <motion.h2
                initial={{x : 800}}
                animate={{ x: 0}}
                transition={{ ease: "easeOut", duration: 2 }}
            >- ドラえもんの初期デザインでは、口が「△」の形をしており、現在の丸い口とは異なっていました -</motion.h2>
            <motion.button
                className='header-button button'
                whileHover={{ scale: 1.2, color:'gold'}}
                whileTap={{ scale: 0.9 }}
                transition={{ type: "spring", stiffness: 400, damping: 17 }}
            >
                <motion.h3
                    whileHover={{ scale: 1.2, color:'gold'}}
                    whileTap={{ scale: 0.9 }}
                    transition={{ type: "spring", stiffness: 400, damping: 17 }}
                >知らんわ
                </motion.h3>
            </motion.button>
        </motion.div>
    );
}

export default Header;
