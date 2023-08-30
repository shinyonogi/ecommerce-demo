import React from 'react';
import './header.css';

import { easeIn, easeOut, motion } from 'framer-motion';

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
            <h1>眠いんだにゃ。</h1>
            <h2>- ドラえもんの初期デザインでは、口が「△」の形をしており、現在の丸い口とは異なっていました -</h2>
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
