import hashlib

def secure_token(data):
    return hashlib.sha256(data.encode()).hexdigest()

print('🛡️ Seguridad avanzada lista')
