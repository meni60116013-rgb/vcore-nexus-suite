const WebSocket = require('ws');
const server = new WebSocket.Server({ port: 8080 });

server.on('connection', ws => {
  console.log('✅ Cliente conectado al Control Plane');
  ws.on('message', message => {
    console.log(`📩 Mensaje recibido: ${message}`);
    ws.send(`Echo: ${message}`);
  });
});

console.log("🚀 Control Plane escuchando en puerto 8080");
