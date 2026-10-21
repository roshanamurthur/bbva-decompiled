class GlomoNonPreapprovedCreditCardBureauManager extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior],
Polymer.Element) {
  static get is() {
    return 'glomo-non-preapproved-credit-card-bureau-manager';
  }

  static get properties() {
    return {

      /**
       * Receives customerId
       */
      cacheChannel: {
        type: String,
        value: ''
      },

      /**
       * Stores termTypeId used for getCustomers
       */
      nonPreApprovedCreditCardTermTypeId: {
        type: String,
        value: ''
      },

      /**
       * Stores images paths
       */
      images: {
        type: Object,
        value: () => ({})
      },

      /**
       * Stores product id
       */
      _productId: {
        type: String,
        value: ''
      },
      /**
       * indicator that validates if you have all the documents
       */
      validateDocumentIndicators: {
        type: Boolean,
        value: false
      },
      /**
       * stores missing mandatory documents
       */
      digitalMissingDocuments: {
        type: Array,
        value: () => (['IDENTITY', 'PROOF_OF_ADDRESS'])
      },
      /**
       * stores missing mandatory personal data
       */
      missingPersonalDataLabel: {
        type: Object,
        value: () => ({
          'CURP': 'non-preapproved-credit-card-bureau-update-curp',
          'Birth Date': 'non-preapproved-credit-card-bureau-update-birthday',
          'Gender': 'non-preapproved-credit-card-bureau-update-gender',
          'Nationality': 'non-preapproved-credit-card-bureau-update-rfc',
          'Marital Satus': 'non-preapproved-credit-card-bureau-update-civil-status',
          'Country': 'non-preapproved-credit-card-bureau-update-country'
        })
      },
      /**
       * stores the user's missing documents
       */
      missingDocuments: {
        type: Object,
        value: () => ({})
      },
      /**
       * stores the user's missing personal data
       */
      missingPersonalData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Constants object
       * @type {Object}
       */
      CONSTANTS: {
        type: Object,
        value: {
          ERROR_CODE_UNAUTH: 400,
          ERROR_MESSAGE_UNAUTH: 'EL CLIENTE NO ESTA AUTORIZADO, ACUDE A TU SUCURSAL',
        }
      }
    };
  }

  /**
   *  Method for dispatch diferents events
   * @param {String} eventName
   * @param {Object} detail
   */
  _dispatchEvents(eventName, detail = {}) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

  /**
   * Initializes flow, sets customerId and validates if there is an error code
   */
  initPage(payload) {
    if (this.c(payload, 'productId')) {
      this._productId = this.c(payload, 'productId');
      const customerId = this.c(this.cacheChannel, 'customer.customerId') ? this.c(this.cacheChannel, 'customer.customerId') : this.cacheChannel;
      const hasErrorCode = this._validateErrorCode(this.c(payload, 'errorCode'));
      const toDoAfterErrorCodeValidation = hasErrorCode ? '_setDebtAlertProperties' : 'dispatchValidateDigitalfile';
      this[toDoAfterErrorCodeValidation]();
      this._dispatchEvents('set-customer-id', customerId);
    }
  }

  /**
   * Validates if payload has specific error code
   */
  _validateErrorCode(errorCode) {
    return errorCode === 'CNA1039' || errorCode === 'CNA1040';
  }

  /**
   * Sets properties for debt alert
   */
  _setDebtAlertProperties() {
    const debtAlert = {
      fullHeight: true,
      code: 'CREDIT-CARD-DEBT-MODAL',
      headerTitle: this.t('non-preapproved-credit-card-modal-header-title'),
      closeIconIdRigth: 'coronita:close',
      imageUrl: this.c(this.images, 'tipsDollar'),
      titleText: this.t('non-preapproved-credit-card-modal-past-due-payments-title-text'),
      text: this.t('non-preapproved-credit-card-modal-past-due-payments-text'),
      configButtons: {
        buttons: {
          primary: {
            text: this.t('non-preapproved-credit-card-modal-accept-button-label'),
            class: 'primary'
          }
        }
      },
      unfixed: true
    };

    this._dispatchEvents('open-with-config-modal-card-advice', debtAlert);
  }

  /**
   * Calls postValidateDigitalFile
   */
  dispatchValidateDigitalfile() {
    this._dispatchEvents('post-validate-digital-file', {
      contract: {
        id: this._productId
      }
    });
    this._dispatchEvents('open-control-veil');
  }

  /**
   * Receives postValidateDigitalFile successful response and parses it
   * @param {Object} response
   */
  successfulPostValidateDigitalFileResponse(response) {
    const hasDocumentsAndPersonalData = this._validatePostValidateDigitalFileResponse(response);
    if (hasDocumentsAndPersonalData) {
      const parsedDocuments = this._parseDocuments(this.c(response, 'documents', []));
      const parsedPersonalData = this._parsePersonalData(this.c(response, 'personalData', []));
      this.missingDocuments = this._validateParsedDocuments(parsedDocuments);
      this.missingPersonalData = this._validateParsedPersonalData(parsedPersonalData);
      this.validateDocumentIndicators = this.c(this.missingDocuments, 'list').length === 0 && this.c(this.missingPersonalData, 'list').length === 0;
      const toDoAfterValidation = this.validateDocumentIndicators ? '_getCustomerTerms' : '_setMissingPersonalDataAlertProperties';
      this[toDoAfterValidation](this.missingDocuments, this.missingPersonalData);
    } else {
      const missingDocuments = this._setMissingDocumentAlertProperties(this.digitalMissingDocuments);
      const missingPersonalData = this._setMissingPersonalDataProperties(Object.values(this.missingPersonalDataLabel));
      this._setMissingPersonalDataAlertProperties(missingDocuments, missingPersonalData);
    }
  }

  /**
   * Validates if documents and personalData exist in payload
   * @param {Object} payload
   */
  _validatePostValidateDigitalFileResponse(payload) {
    return this.c(payload, 'documents', []).length > 0 || this.c(payload, 'personalData', []).length > 0;
  }

  /**
   * Parses documents from validate digital file
   * @param {Array} documents
   */
  _parseDocuments(documents) {
    return documents.map(doc => ({
      documentCategory: this.c(doc, 'documentCategory.id'),
      documentTypeId: this.c(doc, 'documentType.id'),
      isDigitized: this.c(doc, 'isDigitized'),
      status: this.c(doc, 'status.id')
    }));
  }

  /**
   * Parses personal data from validate digital file
   * @param {Array} personalData
   */
  _parsePersonalData(personalData) {
    const temporaryPersonalData = [];
    const mustHavePersonalData = ['CURP', 'Birth Date', 'Gender', 'Nationality', 'Marital Satus', 'Country'];
    personalData.forEach(data => {
      if (mustHavePersonalData.includes(this.c(data, 'dataType.id'))) {
        temporaryPersonalData.push({
          dataTypeId: this.c(data, 'dataType.id'),
          isRegistered: this.c(data, 'isRegistered')
        });
      }
    });

    return temporaryPersonalData;
  }

  /**
   * Validates if a document is missing
   * @param {Array} parsedDocuments
   */
  _validateParsedDocuments(parsedDocuments) {
    let missingDocuments = [];

    const possibleDocuments = {
      IDENTITY: {
        documentCategory: 'IDENTITY',
        isDigitized: true,
        status: 'VALID'
      },
      PROOF_OF_ADDRESS: {
        documentCategory: 'PROOF_OF_ADDRESS',
        isDigitized: true,
        status: 'VALID'
      }
    };

    if (parsedDocuments.length === 0) {
      missingDocuments = this.digitalMissingDocuments;
    } else {
      parsedDocuments.forEach(doc => {
        const statusDocument = this.c(doc, 'status');
        const statusPosibbleDocuments = this.c(possibleDocuments[this.c(doc, 'documentCategory')], 'status');
        if (statusDocument !== statusPosibbleDocuments) {
          missingDocuments.push(this.c(doc, 'documentCategory'));
        }
      });
    }
    return this._setMissingDocumentAlertProperties(missingDocuments);
  }

  /**
   * Adds missing documentss to list
   * @param {Array} missingDocuments
   */
  _setMissingDocumentAlertProperties(missingDocuments) {
    const labels = [];

    const missingDocumentsLabels = {
      IDENTITY: 'non-preapproved-credit-card-bureau-update-identity',
      PROOF_OF_ADDRESS: 'non-preapproved-credit-card-bureau-update-proof-of-address'
    };

    missingDocuments.forEach(doc => {
      labels.push(missingDocumentsLabels[doc]);
    });

    return {
      title: 'non-preapproved-credit-card-bureau-update-documents-title',
      list: labels,
      class: 'cells-lists-with-text-left text-align-left'
    };
  }

  /**
   * Validates if a personalData is missing
   * @param {Array} response
   */
  _validateParsedPersonalData(parsedPersonalData) {
    let missingPersonalData = [];

    if (parsedPersonalData.length === 0) {
      missingPersonalData = [ ...Object.values(this.missingPersonalDataLabel) ];
    } else {
      parsedPersonalData.forEach(data => {
        if (!this.c(data, 'isRegistered')) {
          missingPersonalData.push(this.missingPersonalDataLabel[this.c(data, 'dataTypeId')]);
        }
      });
    }

    return this._setMissingPersonalDataProperties(missingPersonalData);
  }

  /**
   * returns an object with missing personal data
   * @param {Array} missingPersonalData
   */
  _setMissingPersonalDataProperties(missingPersonalData) {
    return {
      title: 'non-preapproved-credit-card-bureau-update-personal-data-title',
      list: missingPersonalData,
      class: 'cells-lists-with-text-left text-align-left'
    };
  }

  /**
   * Calls getCustomerTerms in customers global api's
   */
  _getCustomerTerms() {
    this._dispatchEvents('get-customer-terms', {
      'termType.id': this.nonPreApprovedCreditCardTermTypeId
    });
  }

  /**
   * Sets missing documents and missing personal data to be shown in modal
   * @param {Array} missingDocuments
   * @param {Array} missingPersonalData
   */
  _setMissingPersonalDataAlertProperties(missingDocuments, missingPersonalData) {
    const missingDataAlert = {
      code: 'NPA-CREDIT-CARD-MISSING-DOCUMENTS-DATA',
      primaryButtonClass: 'primary',
      textWithIcon: 'text-with-icon spacing-left',
      selectedConfig: {
        className: 'full-height-error close-button--right image--auto',
        openMaximized: true,
        title: 'non-preapproved-credit-card-bureau–header-title',
        heroImage: this.c(this.images, 'requestCancelledImage'),
        message: 'non-preapproved-credit-card-bureau-update-file-title',
        acceptBtLabel: 'non-preapproved-credit-card-bureau-accept-button-label',
        template: {
          type: 'paragraphs',
          values: [
            { text: ' ', class: 'spacing' },
            this.c(missingDocuments, 'list', []).length === 0 ? '' : missingDocuments,
            { text: ' ', class: 'spacing' },
            this.c(missingPersonalData, 'list', []).length === 0 ? '' : missingPersonalData,
            {
              icon: 'coronita:info',
              iconClass: 'icon-size-24',
              message: 'non-preapproved-credit-card-bureau-update-file-message',
              type: 'info-dark',
              className: 'top-icon-message margin-l',
            }
          ]
        },
        hasMultipleRedirectLink: {
          values: [
            {
              linkIcon: 'coronita:share',
              iconClass: 'icon-size-24 icon-share',
              link: 'non-preapproved-credit-card-bureau-share-icon-text',
              eventName: 'show-share',
              class: 'below-paragraph icon-share'
            },
            {
              linkIcon: 'coronita:place',
              iconClass: 'icon-size-24',
              link: 'non-preapproved-credit-card-bureau-place-icon-text',
              eventName: 'show-map',
              class: 'below-paragraph'
            },
          ]
        }
      }
    };
    this._dispatchEvents('show-missing-documents-personal-data-modal', missingDataAlert);
    this._dispatchEvents('close-control-veil');
  }

  /**
   * Receives customer terms succesful response and validates if length is greater than 0
   * @param {Object} response
   */
  getCustomerTermsSuccessfulResponse(response) {
    const hasBureau = response && response.length > 0;
    this._setBureauContentPage(hasBureau);
  }

  /**
   * Sets properties to be shown on screen depending if client has made bureau query
   * @param {Object} hasBureau
   */
  _setBureauContentPage(hasBureau) {
    const checkboxButtons = this._setCheckBoxConfig(hasBureau);
    const moleculeHeaderConfig = this._setMoleculeHeaderConfig();
    const textDescriptionConfig = this._setTextDescriptionConfig(hasBureau);
    const iconMessageConfig = this._setIconMessageConfig();
    const confirmButtonsConfig = this._setConfirmButtonsConfig();
    this._dispatchContentPageEvents(checkboxButtons, moleculeHeaderConfig, textDescriptionConfig, iconMessageConfig, confirmButtonsConfig);
    this._validateButtonsConfig(hasBureau);
    this._dispatchEvents('close-control-veil');
  }

  /**
   * Receives boolean and validates if secondCheckbox should be pushed into array
   * @param {Boolean} hasBureau
   */
  _setCheckBoxConfig(hasBureau) {

    const checkBoxConfig = [ {
      id: '002',
      checkboxLabel: 'non-preapproved-credit-card-bureau-second-check',
    } ];

    const secondCheckBox = {
      id: '001',
      checkboxLabel: 'non-preapproved-credit-card-bureau-first-check',
    };

    if (!hasBureau) {
      checkBoxConfig.unshift(secondCheckBox);
    }

    return {
      items: checkBoxConfig
    };
  }

  /**
   * Sets properties to header
   * @param {Boolean} hasBureau
   */
  _setMoleculeHeaderConfig() {
    return {
      className: 'header--core',
      rightIcon: 'coronita:close',
      rightIconSize: '20',
      titleName: 'non-preapproved-credit-card-bureau–header-title'
    };
  }

  /**
   * Sets properties to text description
   * @param {Boolean} hasBureau
   */
  _setTextDescriptionConfig(hasBureau) {

    const className = 'text-centered line-spacing normal-text';
    const extraClassName = hasBureau ? 'row-gap-bottom-l' : '';

    return {
      mainDescription: 'non-preapproved-credit-card-bureau-description',
      decoratedImage: './images/nonPreApprovedCreditCard/search_movements.svg',
      title: this._setTitleConfig(hasBureau),
      className: `${className} ${extraClassName}`
    };
  }

  /**
   * Sets title to text description
   * @param {Boolean} hasBureau
   */
  _setTitleConfig(hasBureau) {
    const title = 'non-preapproved-credit-card-bureau-title-';
    const suffix = hasBureau ? 'request-card' : 'credit-history';
    return title + suffix;
  }

  /**
   * Sets icon message properties
   */
  _setIconMessageConfig() {
    return {
      className: 'top-icon-message margin-l',
      type: 'info',
      icon: 'coronita:info',
      message: 'non-preapproved-credit-card-bureau-info-message'
    };
  }

  /**
   * Set confirm buttons properties
   */
  _setConfirmButtonsConfig() {
    return {
      hideDivider: true,
      unfixed: true,
      config: {
        buttons: {
          primary: {
            text: 'non-preapproved-credit-card-bureau-continue-button',
            disabled: true
          }
        }
      }
    };
  }

  /**
   * Dispatches events to set properties in bureau page
   * @param {Object} checkboxButtons
   * @param {Object} moleculeHeaderConfig
   * @param {Object} textDescriptionConfig
   * @param {Object} iconMessageConfig
   * @param {Object} confirmButtonsConfig
   */
  _dispatchContentPageEvents(checkboxButtons, moleculeHeaderConfig, textDescriptionConfig, iconMessageConfig, confirmButtonsConfig) {
    this._dispatchEvents('set-checkbox-properties', checkboxButtons);
    this._dispatchEvents('set-molecule-header-properties', moleculeHeaderConfig);
    this._dispatchEvents('set-text-description-properties', textDescriptionConfig);
    this._dispatchEvents('set-icon-message-properties', iconMessageConfig);
    this._dispatchEvents('set-confirm-buttons-properties', confirmButtonsConfig);
  }

  /**
   * Sets list buttons config
   * @param {Boolean} hasBureau
   */
  _validateButtonsConfig(hasBureau) {
    const buttons = hasBureau ? [] : this._setButtonsConfig();
    this._dispatchEvents('set-list-file-properties', buttons);
  }

  /**
   * Sets buttons config when hasBureau is false
   */
  _setButtonsConfig() {
    return [
      {
        icon: 'coronita:document',
        text: 'non-preapproved-credit-card-bureau-autorization',
        classList: 'list-file-margin list-file-margin-left'
      }
    ];
  }

  /**
   * Sets Properties to credit history authorization help modal
   */
  setPropertiesCreditHistoryAuthorizationHelpModal() {
    const modal = {
      heroImage: '',
      headerTitle: this.t('non-preapproved-credit-card-modal-header-title'),
      acceptButton: this.t('non-preapproved-credit-card-modal-accept-button-label'),
      icon: 'help',
      hideContentContainer: true,
      values: [ {
        class: 'title-l main-description-no-margin-top margin-none',
        title: this.t('non-preapproved-credit-card-modal-annuity-title'),
        text: this.t('non-preapproved-credit-card-modal-annuity-text')
      } ]
    };

    this._dispatchEvents('set-credit-history-help-modal-properties', modal);
    this._dispatchEvents('open-credit-history-help-modal');
  }

  /**
   * Post customer terms when clicking on continue button
   */
  setPostCustomerTerms() {
    if (!this.validateDocumentIndicators) {
      this._setMissingPersonalDataAlertProperties(this.missingDocuments, this.missingPersonalData);
    } else {
      const body = [
        {
          termType: {
            id: 'BD-MX-AA-AUTBUR-001'
          },
          status: {
            id: 'ACCEPTED'
          },
          origin: {
            id: 'NP'
          },
          acceptanceMethod: {
            id: 'CHECK'
          },
          referenceNumber: 'TARJETA',
          acceptanceMessages: [
            {
              value: this.t('non-preapproved-credit-card-modal-annuity-text')
            }
          ]
        }
      ];
      this._dispatchEvents('post-customer-terms', body);
    }
  }

  /**
   * Handles a step back request on the process.
   * This function throws a show-close-confirm event in order to show an alert exit message.
   */
  manageBackButton() {
    const detail = {
      code: 'CREDIT-BUREAU-MANAGER-EXIT',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'non-preapproved-credit-card-accept-back-button-label',
        cancelBtLabel: 'non-preapproved-credit-card-cancel-back-button-label',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            { text: 'non-preapproved-credit-card-back-button-message' }
          ]
        }
      }
    };

    this._dispatchEvents('show-close-confirm', detail);
  }

  /**
   * Manages methos to reset bureau page components
   */
  setResetProperties() {
    const textDescription = this._resetTextDescription();
    const moleculeHeader = this._resetMoleculeHeader();
    const checkboxes = this._resetCheckboxes();
    const iconMessage = this._resetIconMessage();
    const confirmButtons = this._resetConfirmButtons();
    this._dispatchContentPageEvents(checkboxes, moleculeHeader, textDescription, iconMessage, confirmButtons);
    this._dispatchEvents('set-list-file-properties', []);
    this.missingDocuments = {};
    this.missingPersonalData = {};
    this.validateDocumentIndicators = false;
  }

  /**
   * Sets properties to text description
   */
  _resetTextDescription() {
    return {
      mainDescription: '',
      decoratedImage: '',
      title: '',
      className: ''
    };
  }

  /**
   * Sets properties to molecule header
   */
  _resetMoleculeHeader() {
    return {
      className: '',
      rightIcon: '',
      rightIconSize: '',
      titleName: ''
    };
  }

  /**
   * Sets properties to icon message
   */
  _resetIconMessage() {
    return {
      className: '',
      type: '',
      icon: '',
      message: ''
    };
  }

  /**
   * Sets properties to checkboxes
   */
  _resetCheckboxes() {
    return {
      items: []
    };
  }

  /**
   * Sets properties to confirm buttons
   */
  _resetConfirmButtons() {
    return {
      hideDivider: false,
      unfixed: false,
      config: {
        buttons: ''
      }
    };
  }

  /**
   * Sets error id for validate digital file error response
   */
  postValidateDigitalFileErrorResponse(error) {
    const { status: statusCode, messages } = error || {};
    if (statusCode === this.CONSTANTS.ERROR_CODE_UNAUTH && messages?.[0]?.message === this.CONSTANTS.ERROR_MESSAGE_UNAUTH) {
      const missingDocuments = this._setMissingDocumentAlertProperties(this.digitalMissingDocuments);
      const missingPersonalData = this._setMissingPersonalDataProperties(Object.values(this.missingPersonalDataLabel));
      this._setMissingPersonalDataAlertProperties(missingDocuments, missingPersonalData);
    } else {
      this._setRetryErrorProps('RETRY-POST-VALIDATE-DIGITAL-FILE');
    }
  }

  /**
   * Sets retry error properties
   * @param {String} id
   */
  _setRetryErrorProps(id) {
    const config = {
      title: this.t('non-preapproved-credit-card-post-validate-digital-file-error-title'),
      acceptBtLabel: this.t('non-preapproved-credit-card-post-validate-digital-file-error-accept-button-label'),
      cancelBtLabel: this.t('non-preapproved-credit-card-post-validate-digital-file-error-cancel-button-label'),
      className: 'error',
      message: this.t('non-preapproved-credit-card-post-validate-digital-file-error-message'),
      messageClass: '',
      fullModal: false,
    };

    const callConfig = {
      title: this.t('non-preapproved-credit-card-post-validate-digital-file-error-title'),
      acceptBtLabel: this.t('non-preapproved-credit-card-post-validate-digital-file-error-cancel-button-label'),
      cancelBtLabel: '',
      className: 'error',
      message: this.t('non-preapproved-credit-card-post-validate-digital-file-error-final-message'),
      messageClass: '',
      fullModal: false,
    };

    const retryErrorData = {
      errorId: id,
      errorType: 'operative',
      disabledOpenDialerAction: true,
      retryConfig: config,
      callConfig: callConfig,
    };
    this._dispatchEvents('retry-error', Object.assign({ retryErrorData }));
    this._dispatchEvents('close-control-veil');
  }

  /**
   * Dispatches event to go back to entry point
   */
  backToEntryPoint() {
    this._dispatchEvents('back-to-entry-point');
  }

  /**
   * Sets error id for post customer terms error response
   */
  postCustomerTermsErrorResponse() {
    this._setRetryErrorProps('RETRY-POST-CUSTOMER-TERMS');
  }

}

customElements.define(GlomoNonPreapprovedCreditCardBureauManager.is, GlomoNonPreapprovedCreditCardBureauManager);