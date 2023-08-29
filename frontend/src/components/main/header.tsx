import React from 'react';
import './header.css';

import { easeIn, easeOut, motion } from 'framer-motion';

function Header() {
    return(
        <motion.div
            initial={{opacity: 0}}
            animate= {{opacity: 1}}
            transition={{ease: 'easeInOut', duration: 2}}
            className='header-container'
        >

        </motion.div>
    );
}

export default Header;
