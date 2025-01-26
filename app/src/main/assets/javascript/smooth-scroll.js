/*!
 * Smooth Scroll v1.0.0
 */

(function($) {
    'use strict';

    // Cuando el documento esté listo
    $(document).ready(function() {
        // Capturar todos los enlaces internos (los que empiezan con #)
        $('a[href^="#"]').on('click', function(event) {
            // Prevenir el comportamiento por defecto
            event.preventDefault();

            // Obtener el elemento destino
            var target = $(this.hash);
            if (target.length) {
                // Calcular la posición del elemento
                var targetPosition = target.offset().top;

                // Realizar la animación de scroll
                $('html, body').animate({
                    scrollTop: targetPosition - 20 // 20px de margen superior
                }, {
                    duration: 400, // Duración de la animación en milisegundos
                    easing: 'easeInOutQuad', // Tipo de animación
                    complete: function() {
                        // Actualizar la URL sin recargar la página
                        if (history.pushState) {
                            history.pushState(null, null, target.selector);
                        }
                    }
                });
            }
        });
    });

    // Función de easing personalizada
    $.easing.easeInOutQuad = function (x, t, b, c, d) {
        if ((t/=d/2) < 1) return c/2*t*t + b;
        return -c/2 * ((--t)*(t-2) - 1) + b;
    };

})(jQuery); 