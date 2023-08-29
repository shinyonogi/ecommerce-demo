import React from 'react';
import { Link } from 'react-router-dom';
import { motion } from 'framer-motion';

import './navbar.css';

function Navbar() {
    return(
        <div className='navbar-container'>
            <nav>
                <ul className='navbar-elemenents'>
                    <motion.li
                        initial={{y : -400}}
                        animate={{ y: 0}}
                        transition={{ ease: "easeOut", duration: 1 }}
                    >
                        <div className="vertical-line"></div>
                        <motion.span whileHover={{scale:1.5}}>にゃー</motion.span>
                    </motion.li>
                    <motion.li
                        initial={{y : -400}}
                        animate={{ y: 0 }}
                        transition={{ ease: "easeOut", duration: 1.17}}
                    >
                        <div className="vertical-line"></div>
                        <motion.span whileHover={{scale:1.5}}>にゃー</motion.span>
                    </motion.li>
                    <motion.li
                        initial={{y : -400}}
                        animate={{ y: 0 }}
                        transition={{ ease: "easeOut", duration: 1.34 }}
                    >
                        <div className="vertical-line"></div>
                        <motion.span whileHover={{scale:1.5}}>にゃー</motion.span>
                        <div className="vertical-line"></div>
                    </motion.li>
                    <motion.li id="navbar-element-right"
                        initial={{y : -400}}
                        animate={{ y: 0 }}
                        transition={{ ease: "easeOut", duration: 1.5 }}
                    >
                        <motion.span whileHover={{scale:1.5}}>にゃー</motion.span>
                        <div className="vertical-line"></div>
                    </motion.li>
                </ul>
            </nav>
        </div>
    )
}

export default Navbar;



