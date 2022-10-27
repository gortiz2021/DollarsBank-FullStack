import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container, Paper } from '@mui/material';

export default function Login() {

    const paperstyle = {padding: '50px 20px', width: 600, margin: '20px auto'}

  return (
    <Container>
        <Paper elevation={3} style={paperstyle}>
        <h1>Login</h1>
    
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Username" variant="outlined" />
      <TextField id="outlined-basic" label="Password" variant="outlined" />

    </Box>
    </Paper>
    </Container>
  );
}
