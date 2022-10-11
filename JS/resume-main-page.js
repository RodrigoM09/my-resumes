/** VARIABLES FOR CLASS=MODALS AND CLASS=MYBTN */
let modals = document.getElementsByClassName("modal");
let modalOpenBtn = document.getElementsByClassName("myBtn");
let currentModal;

/**------------------ FUNCTION TO OPEN MODAL USING ID-----------------------------------*/
function openModal(id) {
    for (let i = 0; i < modals.length; i++) {
        if (modals[i].getAttribute('id') === id) {
            currentModal = modals[i];
            currentModal.style.display = "block";
            break;
        }
    }
}

/** WHEN USER CLICK MORE INFORMATION BUTTON MODAL PERTAINING TO ID OPENS */
modalOpenBtn.onclick = function() {
    let currentID = modalOpenBtn.getAttribute('id');
    openModal(currentID);
}

/**------------------ FUNCTION TO OPEN MODAL USING ID-----------------------------------*/
  function closeModal(id) {
    for (let i = 0; i < modals.length; i++) {
        if (modals[i].getAttribute('id') === id) {
            currentModal = modals[i];
            currentModal.style.display = "none";
            break;
        }
    }
}
/** WHEN USER CLICKS X BUTTON MODAL PERTAINING TO ID CLOSES */
let modalCloseBtn = document.getElementsByClassName("close");
modalCloseBtn.onclick = function() {
    let currentID = modalCloseBtn.getAttribute('id');
    closeModal(currentID);
}