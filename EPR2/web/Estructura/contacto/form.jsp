    <div class="form-style-10">
        <h1>Contacto<span>Envianos un correo a través de este formulario</span></h1>
        <form action="ControladorContacto" method="post">
            <div class="inner-wrap">
                <label>Nombre <input type="text" name="nom" required/></label>
                <label>Apellido <input type="text" name="ape" required/></label>
                <label>Email <input type="email" name="email" required/></label>
                <label>Mensaje <textarea name="mensaje" required></textarea></label>
            </div>

            <div class="button-section" style="text-align: center;">
                <input type="submit" name="enviar" value="Enviar">
            </div>
        </form>
    </div>
</body>