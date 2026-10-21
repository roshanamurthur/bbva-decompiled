class CellsKeyRecoveryUpdate extends Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior ], Polymer.Element) {

  static get is() {
    return 'cells-key-recovery-update';
  }

  static get properties() {
    return {
      /**
       * Title
       */
      title: {
        type: String,
        value: 'cells-key-recovery-title'
      },
      /**
       * Has title
       */
      hasTitle: {
        type: Boolean,
        value: false
      },
      /**
       * Description for key recovery update operative
       */
      keyRecoveryDescription: {
        type: String,
        value: 'cells-key-recovery-update-description'
      },
      /**
       * Disabled input if step is not active
       */
      active: {
        type: Boolean,
        value: false
      },
      /**
       * User actual password
       */
      actualPassword: {
        type: String,
        notify: true
      },
      /**
       * User actual password placeholder label
       */
      actualPasswordLabel: {
        type: String,
        value: 'cells-key-recovery-input-actual-password'
      },
      /**
       * Icon for key recovery password input
       */
      inputIcon: {
        type: String,
        value: 'coronita:visualize'
      },
      /**
       * Icon size for key recovery password input
       */
      inputIconSize: {
        type: String,
        value: '24'
      },
      /**
       * Icon toggled for key recovery password input
       */
      inputIconToggled: {
        type: String,
        value: 'coronita:hide'
      },
      /**
      * Extra Icon Configuration for binding extra-icon and extra-icon-visibility to cells-molecule-input
      */
      extraIconConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * Allowed chars in key recovery update input
       */
      allowedChars: {
        type: String,
        value: '[a-zA-Z0-9]'
      },
      /**
       * Maximum number of characters in key recovery update input
       */
      maxNumberCharacters: {
        type: String,
        value: ''
      },
      /**
       * Icon error in key recovery update input
       */
      errorMessageIcon: {
        type: String,
        value: 'coronita:alert'
      },
      /**
       * Current password error message
       */
      currentPasswordErrorMessage: {
        type: String,
        value: 'cells-key-recovery-current-password-error-message'
      },
      /**
       * Regular expression used to know if the user has deleted a character icluded in validation mask patter (check out cells-input-validations-behavior docs) to fix the cursor position on android devices
       * @type {Boolean}
       */
      inputStatusValidate: {
        type: Boolean,
        value: false
      },
      /**
       * Allow complete value removal if backspace key is pressed and input type is password
       */
      backspacePwdFullDelete: {
        type: Boolean,
        value: false
      },
      /**
       * Input actual pwd validation status
       */
      invalidActualPwd: {
        type: Boolean,
        value: false
      },
      /**
       * New password description text
       */
      newPasswordDescription: {
        type: String,
        value: 'cells-key-recovery-title-new-password'
      },
      /**
       * New password description icon
       */
      newPasswordDescriptionIcon: {
        type: String,
        value: 'coronita:help'
      },
      /**
       * New password description icon size
       */
      newPasswordDescriptionIconSize: {
        type: String,
        value: 'icon-size-24'
      },
      /**
       * User new password value
       */
      newPassword: {
        type: String,
        notify: true
      },
      /**
       * New password placeholder label
       */
      newPasswordLabel: {
        type: String,
        value: 'cells-key-recovery-input-new-password'
      },
      /**
       * Reset the previous valid values
       */
      resetPreviousValue: {
        type: Boolean,
        value: false
      },
      /**
       * New pwd error message
       */
      newPwdErrorMessage: {
        type: String,
        value: ''
      },
      /**
       * List of possible error messages
       */
      newPwdErrorMessages: {
        type: Object,
        value: {
          'samePasswordError': 'cells-key-recovery-update-actual-and-new-should-be-differents-error',
          'invalidFormat': 'cells-key-recovery-error-input-message-password-requirements',
          'sensitiveWords': 'cells-key-recovery-update-new-pwd-format-error',
          'minimumLength': 'cells-key-recovery-new-pwd-format-error-message-length',
          'identicalChars': 'cells-key-recovery-new-pwd-format-error-message-identical',
          'consecutiveChars': 'cells-key-recovery-new-pwd-format-error-message-consecutive'
        }
      },
      /**
       * Disabled input new password
       */
      _disabledInputNewPassword: {
        type: Boolean,
        computed: '_isDisabledInputNewPwd(isUpdate, actualPassword, active)'
      },
      /**
       * Disabled class for new password input description
       */
      _disabledClass: {
        type: String,
        computed: '_setDisabledClass(_disabledInputNewPassword)'
      },
      /**
       * Flag to indicate new password input is invalid
       */
      invalidNewPwd: {
        type: Boolean,
        value: false
      },
      /**
       * Allow special chars
       * prevent user from entering incorrect input when false
       * use the `allowedChars` param to set which characters are allowed
       */
      allowSpecialChars: {
        type: Boolean,
        value: false
      },
      /**
        * List with items to check on new password input
        * @type {Array}
        */
      items: {
        type: Array
      },
      /**
       * Password security level from esf-pass-checker component
       */
      securityLevel: {
        type: Object,
        value: () => ({})
      },
      /**
       * Security level message
       */
      securityLevelMessage: {
        type: String,
        value: 'cells-key-recovery-update-security-level'
      },
      /**
       * User confirmation new password input value
       */
      confirmPassword: {
        type: String,
        notify: true
      },
      /**
       * new password placeholder label
       */
      confirmPasswordLabel: {
        type: String,
        value: 'cells-key-recovery-input-confirm-password'
      },
      /**
       * User confirmation new password error message
       */
      confirmPasswordErrorMessage: {
        type: String,
        value: 'cells-key-recovery-error-confirm-input-message'
      },
      /**
       * Disabled input confirm password
       */
      _disabledInputConfirmPassword: {
        type: Boolean,
        computed: '_isDisabledInputConfirmPwd(securityLevel, _disabledInputNewPassword)'
      },
      /**
       * Input actual pwd validation status
       */
      invalidConfirmPwd: {
        type: Boolean,
        value: false
      },
      /**
       * Disabled button
       */
      disabledBtn: {
        type: Boolean,
        value: false,
        computed: '_isDisabledBtn(confirmPassword, newPassword, active, actualPassword, isUpdate, securityLevel)'
      },
      /**
       * Continue button label
       */
      continueButtonLabel: {
        type: String,
        value: 'cells-key-recovery-update-button'
      },
      /**
       * Cancel button label
       */
      cancelButtonLabel: {
        type: String,
        value: ''
      },
      /**
       * Property to set modal object on openDescriptionHelperModal
       */
      descriptionModal: {
        type: Object,
        value: () => ({})
      },
      /**
       * Key code
       */
      enterKeyCode: {
        type: Number
      },
      /**
       * Flag to activate security level message
       */
      isSecurityLevelEnable: {
        type: Boolean,
        value: false
      },
      /**
       * Show actual password input in process is update pwd
       */
      isUpdate: {
        type: Boolean,
        value: false
      },
      /**
       * Size config for inline icon
       */
      inlineIconSize: {
        type: Object,
        value: () => ({
          width: '16px',
          height: '16px'
        })
      },
      /**
       * Show label message new password input
       */
      showLabelNewPassword: {
        type: Boolean,
        value: false
      },
      /**
       * Show label current password input
       */
      showLabelCurrentPwd: {
        type: Boolean,
        value: false
      },
      /**
       * Show label description current password input
       */
      showDescriptionCurrentPwd: {
        type: Boolean,
        value: false
      },
      /**
       * Current password description
       */
      currentPasswordDescription: {
        type: String,
        value: 'cells-key-recovery-update-title-new-password'
      },
      /**
       * Minimum number of characters in key recovery update input
       */
      minNumberCharacters: {
        type: String,
        value: ''
      },
      /**
       * Class security level
       */
      _classSecurityLevel: {
        type: String,
        value: ''
      },
      /**
       * Validation word bbva in new password
       */
      _checkInvalidWords: {
        type: Boolean,
        value: false
      }
    };
  }

  /* -------------------------------------------------------------------------- */
  /*                             Resets                                         */
  /* -------------------------------------------------------------------------- */

  reset() {
    this.actualPassword = '';
    this.resetActualPasswordValidation();
    this.newPassword = '';
    this.resetNewPwdValidation();
    this.confirmPassword = '';
    this.resetConfirmPasswordValidation();
    this.securityLevel = {};
  }

  /**
  * Resets actualPasswordErrorMessage and invalidActualPwd properties
  */
  resetActualPasswordValidation() {
    this.actualPasswordErrorMessage = '';
    this.invalidActualPwd = false;
  }

  /**
  * Resets isSecurityLevelEnable and invalidNewPwd properties
  */
  resetNewPwdValidation() {
    this.isSecurityLevelEnable = false;
    this.invalidNewPwd = false;
    this.newPwdErrorMessage = '';
  }

  /**
  * Resets invalidConfirmPwd property
  */
  resetConfirmPasswordValidation() {
    this.invalidConfirmPwd = false;
  }

  /* -------------------------------------------------------------------------- */
  /*                             Button methods                                 */
  /* -------------------------------------------------------------------------- */

  /**
   * Dispatch event with description help config modal
   */
  _openDescriptionHelperModal() {
    this._fireEvent('key-recovery-update-open-description-helper-modal', this.descriptionModal);
  }

  /**
   * Dispatch password of inputs
   */
  _sendNewPassword() {
    this._fireEvent('get-passwords', { actualPassword: this.actualPassword, newPassword: this.newPassword });
  }

  /**
   * Dispatch cancel event
   */
  _onCancelClick() {
    this._fireEvent('key-recovery-update-cancel');
  }

  /**
   * Call open init modal function when the the flow starts
   * and reset properties
   */
  initFlow() {
    this._openInitModal();
    this.reset();
  }

  /**
   * Dispatch init modal event
   */
  _openInitModal() {
    this._fireEvent('key-recovery-update-open-init-modal');
  }

  /* -------------------------------------------------------------------------- */
  /*                             Passwords Validation                           */
  /* -------------------------------------------------------------------------- */

  /**
  * Fire events that set values in esf component and fire validation with esf-component
  */
  _validateNewPwd() {
    if (this.newPassword) {
      this._fireEvent('set-current-password', this.actualPassword);
      this._fireEvent('set-new-password', this.newPassword);
      this._fireEvent('fire-validation-password');
      const valueLowerCase = this.newPassword.toLowerCase();
      const bbvaRegex = /bbva/;
      this._checkInvalidWords = bbvaRegex.test(valueLowerCase);
    }
  }

  /**
  * Validates new password format and its relations with actual and confirm password
  * If new password has not error messages shows security level
  */
  strengthNewPasswordValidation(payload) {
    let securityLevelClassText = payload?.class ?? '';
    this.securityLevel = payload;
    this._classSecurityLevel = securityLevelClassText ? `security-level__text security-level__label-${securityLevelClassText}` : '';
    const invalidFormat = {
      code: payload?.flagsErrors[0] ?? 'invalidFormat',
      invalid: this._validateFormat(this.newPassword)
    };

    const errors = [ invalidFormat ];

    const message = this.newPwdErrorMessages[(errors.find(e => e.invalid) || {}).code] || this._checkInvalidWords;
    this.setNewPwdError(this._checkInvalidWords ? 'cells-key-recovery-new-pwd-format-error-message-bbva' : message);
    if (!message) {
      this.isSecurityLevelEnable = true;
      this.resetConfirmPasswordValidation();
    }
    this._validateNewPwdConfirmation();
  }

  _validateNewPwdConfirmation() {
    this.invalidConfirmPwd = this._checkInvalidNewConfirmPassword();
  }

  /**
   * Check differences in passwords
   */
  _checkInvalidNewConfirmPassword() {
    return this.confirmPassword
      ? !!(this.newPassword && this.confirmPassword && this.newPassword !== this.confirmPassword)
      : false;
  }

  /**
   * Validates format based on securityLevel isValid param
   */
  _validateFormat() {
    return !this.securityLevel.isValid;
  }


  /**
   * Set an error message to new password input
   */
  setNewPwdError(errorMessage) {
    if (errorMessage) {
      this.invalidNewPwd = true;
      this.newPwdErrorMessage  = errorMessage;
      this.isSecurityLevelEnable = false;
    }
  }

  /* -------------------------------------------------------------------------- */
  /*                             Disable inputs methods                         */
  /* -------------------------------------------------------------------------- */

  /**
   * Is disabled button
   */
  _isDisabledBtn(confirmPassword, newPassword, active, actualPassword, isUpdate, securityLevel) {
    const passwords = [confirmPassword, newPassword];
    if (isUpdate) {
      passwords.push(actualPassword);
    }
    const errors = [
      passwords.some(password => !password),
      !securityLevel.isValid,
      this._checkInvalidNewConfirmPassword()
    ];
    return (!errors.some(error => error) && active);
  }

  /**
   * Disabled new input pwd
   */
  _isDisabledInputNewPwd(isUpdate, actualPassword, active) {
    const isDisabled = !!isUpdate && !actualPassword || !active;
    if (isDisabled) {
      this.reset();
    }
    return isDisabled;
  }

  /**
   * Disabled confirm input pwd
   */
  _isDisabledInputConfirmPwd(securityLevel, _disabledInputNewPassword) {
    return _disabledInputNewPassword || !securityLevel.isValid  || this._checkInvalidWords;
  }

  _setDisabledClass(_disabledInputNewPassword) {
    return _disabledInputNewPassword ? 'new-pwd-disabled' : '';
  }

  /* -------------------------------------------------------------------------- */
  /*                             Helpers                                        */
  /* -------------------------------------------------------------------------- */

  /**
   * Dispatch generic event
   * @param {String} eventName
   * @param {*} detail
   */
  _fireEvent(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      detail,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Fires the blur after clicking enter on the keyboard
   * @param {e} event
   */
  onKeyboardPress(e) {
    if (e.keyCode === this.enterKeyCode) {
      e.currentTarget.blur();
    }
  }
}

customElements.define(CellsKeyRecoveryUpdate.is, CellsKeyRecoveryUpdate);
