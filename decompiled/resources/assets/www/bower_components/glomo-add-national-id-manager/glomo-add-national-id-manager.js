/* global moment */
/*eslint no-useless-escape: 0, "no-shadow": [2, { "hoist": "functions" }]*/
class GlomoAddNationalIdManager extends Polymer.mixinBehaviors([CellsBehaviors.i18nBehavior, CellsBehaviors.pluginBehavior], Polymer.Element) {
  static get is() {
    return 'glomo-add-national-id-manager';
  }

  static get properties() {
    return {
      /**
       * Global cache storage
       * @type {Object}
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      customerId: {
        type: 'String',
        value: '',
        notify: true
      },
      /**
       * Document evidence of the customer
       * @type {Array}
       */
      _documentEvidence: {
        type: Array,
        value: () => []
      },
      /**
       * Document evidence of the customer
       * @type {Array}
       */
      _selfieEvidence: {
        type: Array,
        value: () => []
      },
      /**
       * All photos converted
       * @type {Object}
       */
      _photoConvertedResult: {
        type: Object,
        value: () => ({})
      },
      /**
       * All photos converted
       * @type {Object}
       */
      _configRequest: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to know if the identification is scanned
       * @type {Boolean}
       */
      _isIdentificationScanned: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to know if the selfie is taked
       * @type {Boolean}
       */
      _isSelfieTaked: {
        type: Boolean,
        value: false
      },
      /**
       * User information
       * @type {Object}
       */
      userInformation: {
        type: Object,
        value: () => ({}),
        observer: '_userInformationSeparated'
      },
      /**
       * User email
       * @type {String}
       */
      userEmail: {
        type: String,
        value: '',
      },
      /**
       * Status for update national id
       * @type {Boolean}
       */
      statusIncomplete: {
        type: Boolean,
        value: false,
      },
      /**
       * Tsec signed
       * @type {String}
       */
      tsecSigned: {
        type: String,
        value: '',
      },
      /**
       * Contain the correct document data of the user
       * @type {Object}
       */
      _correctDocumentData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to know if the veridas box is closed
       */
      _isVeridasBoxClosed: {
        type: Boolean,
        value: false
      },
      /**
       * Save the success data for the receipt
       * @type {Object}
       */
      _successModifyFlow: {
        type: Object,
        value: () => ({})
      },
      /**
       * Counter for the 3rd cancel error modal
       * @type {Number}
       */
      _failedRequest: {
        type: Number,
        value: 0
      },
      /**
       * Counter for the 3rd cancel error veridas modal
       * @type {Number}
       */
      _failedVeridas: {
        type: Number,
        value: 0
      },
      activeModal: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Object that save the document type of the NationalID
       */
      idDocumentTypes: {
        type: Object,
        value: () => ({})
      },
      /**
       * Config to search native flag
       * @type {Object}
       */
      searchNativeFlag: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag value
       * @type {Boolean}
       */
      flagEnabled: {
        type: Boolean,
        value: false
      },
      /**
       * Info business agent
       * @type {Object}
       */
      businessAgent: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag value
       * @type {Boolean}
       */
      hasBusinessAgent: {
        type: Boolean,
        value: false
      },
      /**
       * event code for send email
       * @type {String}
       */
      sendEmailEventCode: {
        type: String,
        value: ''
      },
      /**
       * sender id
       * @type {String}
       */
      senderId: {
        type: String,
        value: ''
      },
      /**
       * devices id
       * @type {String}
       */
      devicesId: {
        type: String,
        value: ''
      },
      /**
       * Service provider id
       * @type {String}
       */
      serviceProviderId: {
        type: String,
        value: ''
      },
      /**
       * Mask character
       * @type {String}
       */
      maskCharacter: {
        type: String,
        value: ''
      },
      /**
       * Text phone number message
       * @type {String}
       */
      phoneNumberLabel: {
        type: String,
        value: ''
      },
      /**
       * Text phone number message
       * @type {String}
       */
      numberClientLabel: {
        type: String,
        value: ''
      },
      /**
       * This phone number client
       * @type {String}
       */
      phoneNumber: {
        type: String,
        value: ''
      },
      /**
       * This number client
       * @type {String}
       */
      clientId: {
        type: String,
        value: ''
      },
      /**
       * Counter for the 3rd cancel error national validate documents
       * @type {Number}
       */
      _failedValidateDocuments: {
        type: Number,
        value: 0
      },
      /**
       * Counter for the 3rd cancel error document verifications
       * @type {Number}
      */
      _failedDocumentVerifications: {
        type: Number,
        value: 0
      },
      /**
      * Status for update national id
      */
      documentStatus: {
        type: String,
        value: '',
      },
      /**
      * Page title
      */
      pageTitle: {
        type: String,
        value: '',
      },
      /**
      * Flag that tells if the put verifications for reverse image is over
      */
      reverseFlag: {
        type: Boolean,
        value: false
      },
      /**
      * Flag that tells if the put verifications for selfie is over
      */
      selfieFlag: {
        type: Boolean,
        value: false
      },
      /**
      * Flag that tells if the put verifications for front flash is over
      */
      obverseFlashFlag: {
        type: Boolean,
        value: false
      },
      /**
      * Flag that tells if the put verifications for front without flash is over
      */
      obverseFlag: {
        type: Boolean,
        value: false
      },
      /**
      * Flag that validates if the user has id or other type of ids
      */
      otherId: {
        type: Boolean,
        value: false
      },
      /**
      * Flag to tells if user comes from TDC and has no INE
      */
      flagIneTdc: {
        type: Boolean,
        value: false
      },
      /**
      * Flag to know if user comes from inApp
      */
      _fromInApp: {
        type: Boolean,
        value: false
      }
    };
  }

  static get observers() {
    return [
      'hideSpinnerPutVerifications(obverseFlag, reverseFlag, selfieFlag)'
    ];
  }
  /**
   * Initi flox
   */
  init() {
    this._setAddNationalIdStep();
    this._setCheckStep();
    this._showSpinner(false);
    this._fireAnalytic('app-page-visit', '');
    this._failedRequest = 0;
    this._failedVeridas = 0;
    this._failedValidateDocuments = 0;
    this._failedDocumentVerifications = 0;
    this.openVeridasBox();
    this._setHeaderTitle();
    this._setButtonLabelCta();
    this._searchBusinessAgent();
    this.resetFlags();
    if (this.documentStatus) {
      let config;
      if (this.otherId) {
        config = {
          code: 'COMPLETE',
          primaryButtonClass: 'primary',
          selectedConfig: {
            className: 'full-height-error sd--image-top-bottom-margin',
            heroImage: './images/info-CMB.svg',
            openMaximized: true,
            title: 'update-national-id-status-incomplete-title',
            acceptBtLabel: 'update-national-id-status-incomplete-accept-bt-label',
            cancelBtLabel: 'update-national-id-status-incomplete-cancel-bt-label',
            template: {
              type: 'paragraphs',
              values: [
                { title: 'update-national-id-other-ids-title', class: 'spacing simple-title'},
                { text: 'update-national-id-other-ids-text-1', class: 'spacing centered-subtitles' },
                { text: 'update-national-id-other-ids-text-2', class: 'spacing centered-subtitles' }
              ]
            }
          }
        };
      } else if (this.documentStatus === 'INCOMPLETE') {
        config = {
          code: 'COMPLETE',
          primaryButtonClass: 'primary',
          selectedConfig: {
            className: 'full-height-error',
            heroImage: './images/verified-document.svg',
            openMaximized: true,
            title: 'update-national-id-status-incomplete-title',
            acceptBtLabel: 'update-national-id-status-incomplete-accept-bt-label',
            cancelBtLabel: 'update-national-id-status-incomplete-cancel-bt-label',
            template: {
              type: 'paragraphs',
              values: [ {
                title: 'update-national-id-status-incomplete-values-template-title',
                text: 'update-national-id-status-incomplete-values-template-text',
                class: 'spacing'
              }
              ]
            }
          }
        };
      }
      if (config) {
        this._dispatch('show-error-modal', config);
        this._fireAnalytic('footprint-complete-update', '');
      }
    }
  }

  /**
   * reset Flow
 */
  reset() {
    this.removeIdentificationPhotos();
    this.removeSelfiePhotos();
    this.openVeridasBox();
    this.resetFlags();
    this._setCheckStep();
    this._dispatch('reset-molecule-input', false);
  }

  /**
    * Dispatch event for exit flow and reset
  */
  halfReset() {
    this.removeIdentificationPhotos();
    this.removeSelfiePhotos();
    this.resetFlags();
    this._setCheckStep();
    this._dispatch('reset-molecule-input', false);
  }

  /**
   * Set the header title
   * @param {Object} userInformation
   */
  _setHeaderTitle() {
    if (this.documentStatus === '' || this.documentStatus === undefined) {
      this.pageTitle = 'update-national-id-title-flow-add';
    } else {
      this.pageTitle = 'update-national-id-title-flow-edit';
    }
    this._dispatch('set-header-title', this.pageTitle);
  }

  /**
   * Set button label cta container
   */
  _setButtonLabelCta() {
    const labelButton = this.flagIneTdc ? 'update-national-id-add-national-id-step-button-tdc' : 'update-national-id-add-national-id-step-button';
    this._dispatch('update-button-summary', labelButton);
  }

  /**
   * Separated User information and set
   * Dispatch event to set operative for navigation success when the user accesses from cch
   * @param {Object} userInformation
  */
  _userInformationSeparated(userInformation) {
    this.flagIneTdc = userInformation.flagIneTdc ? userInformation.flagIneTdc : false;
    this._dispatch('set-operative-for-navigation', this.flagIneTdc ? 'cch' : '');
    this.customerId = userInformation.customerId;
    this.userEmail = this._parsedUserEmail(userInformation.email);
    this.documentStatus = userInformation.documentStatus;
    this.otherId = userInformation.otherId;
  }

  _parsedUserEmail(email) {
    let emailParsed = email ? email.replace(/\*/g, '').toLowerCase() : '';
    return `•${emailParsed}`;
  }

  /**
   * Request the id for the veridas process
   * @event 'update-national-id-open-veridas-box'
   */
  openVeridasBox() {
    const configBox = {
      body: {
        validationType: 'WITH_FLASH',
        origin: {
          id: 'profile_update_national_id_flow'
        }
      }
    };

    this._dispatch('open-veridas-box', configBox);
  }

  /**
   * Set ID of veridas box
   * @param {Object} payload
   */
  openVeridasBoxSuccess(payload) {
    this._failedRequest = 0;
    this.set('veridasOpenBoxId', payload.id);
    this.set('_isVeridasBoxClosed', false);
  }

  /**
   * Error to obtain the veridas box ID
   * @param {Object} payload
   */
  errorVeridasBox(response) {
    this._failedVeridas++;
    this._showSpinner(false);
    if (response.status === 400) {
      if (this._failedVeridas < 3) {
        this._showErrorModals('VISIT-ELECTORAL-INSITUTE', true, 'Foto ilegible', '', [
          { text: 'update-national-id-error-veridas-box-text' },
          {list: [
            'update-national-id-error-veridas-box-list-1',
            'update-national-id-error-veridas-box-list-2',
            'update-national-id-error-veridas-box-list-3',
          ],
          class: 'cells-lists-with-text-left'}
        ]);

        this._fireAnalytic('footprint-unreadable-picture', '');
        this.resetStepAdd();
      } else {
        this._showErrorModals('GENERIC-ERROR-EXIT', false, 'Foto ilegible', '', [
          { text: 'update-national-id-error-veridas-box-text-final' },
          {list: [
            'update-national-id-error-veridas-box-final-list-1',
            'update-national-id-error-veridas-box-final-list-2',
          ],
          class: 'cells-lists-with-text-left'}
        ]);

        this._fireAnalytic('footprint-unreadable-picture', '');
      }
    } else {
      if (this._failedVeridas < 3) {
        this._showErrorModalConnection('ERROR-VERIDAS-BOX', true, 'alert-communication-error-message-retry');
        this._fireAnalytic('footprint-communication', '');
        this.resetStepAdd();
      } else {
        this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
        this._fireAnalytic('footprint-communication', '');
      }
    }
  }

  /**
   * Get instance of Photo Converter Manager
   */
  get photoConverter() {
    return this.shadowRoot.getElementById('converter');
  }

  /**
   * Get the base of the photos name
   */
  get photoName() {
    return moment().format('DMYYYY');
  }

  /**
   * Init the native plugin to scan ID document
   */
  scannIdentification() {
    const identificationConfig = {
      'documents': [
        'MX_IDCard_2014',
        'MX_IDCard_2008',
        'MX_IDCard_2019',
      ],
      'configuration': {
        'closebutton': 'YES',
        'checkdocumenttext': 'GIVEN RESULT',
        'obverseflash': 'NO',
      }
    };
    this._genericCall('DocumentCapture', 'launchdocumentcapture', '', identificationConfig).then(response => {
      this.set('_isIdentificationScanned', true);
      this.set('_documentEvidence', response);
      this._extractDocumentId(this._documentEvidence);
      this._updateAddNationalIdStep();
      this._fireAnalytic('app-step-3', '');
      this.photoConverter.getImageFile({url: this._documentEvidence[0].url, imageName: `IMG${this.photoName}0`, eventName: 'document-without-flash'});

    }).catch(error => {
      this._showErrorModalPermissions('DENEGED-PERMISSIONS', 'update-national-id-error-permissions');
      this._fireAnalytic('footprint-permissions', '');
    });
  }

  /**
   * Get the objects of _documentEvidence and call the setTypeId function
  */
  _extractDocumentId(documentEdivence) {
    const firstObject = documentEdivence[0];
    const secondObject = documentEdivence[1];

    this._setTypeId(firstObject);
    this._setTypeId(secondObject);
  }

  /**
   * Set the documentId for the idDocumentTypes propertie
   */

  _setTypeId(object) {
    if (object.face === 'front' && !object.flash) {
      this.set('idDocumentTypes.frontWithoutFlash', object.documentIds[0]);
    }

    if (object.face === 'back') {
      this.set('idDocumentTypes.back', object.documentIds[0]);
    }
  }

  /**
   * Init the native plugin to take user selfie
   */
  takeSelfie() {
    const selfieConfig =  {
      'configuration': {
        'closebutton': 'YES',
        'checkdocumenttext': 'GIVEN RESULT'
      }
    };
    this._genericCall('SelfieCapture', 'launchselfiecapture', '', selfieConfig).then(response => {
      this.set('_isSelfieTaked', true);
      this.set('_selfieEvidence', response);
      this._updateAddNationalIdStep();
      this._fireAnalytic('app-step-4', '');
      this.photoConverter.getImageFile({ url: this._selfieEvidence[0].url, imageName: `IMG${this.photoName}3`, eventName: 'document-selfie' });
    }).catch(error => {
      console.log(error);
    });
  }

  /**
   * Success document without flash converted
   * @param {Object} detail
   */
  _successDocumentWithoutConverted({detail}) {
    let configRequest = {
      imageFile: detail.file,
      verificationId: this.veridasOpenBoxId,
      attachement: 'obverse-image',
      documentType: this.idDocumentTypes.frontWithoutFlash
    };
    this.set('_photoConvertedResult.documentWithoutFlash', detail);
    this.set('_configRequest.documentWithoutFlash', configRequest);
    this.photoConverter.getImageFile({ url: this._documentEvidence[1].url, imageName: `IMG${this.photoName}1`, eventName: 'document-reverse' });

  }

  /**
   * Success document reverse converted
   * @param {Object} detail
   */
  _successDocumentReverseConverted({detail}) {
    let configRequest = {
      imageFile: detail.file,
      verificationId: this.veridasOpenBoxId,
      attachement: 'reverse-image',
      documentType: this.idDocumentTypes.back
    };
    this.set('_photoConvertedResult.documentReverse', detail);
    this.set('_configRequest.documentReverse', configRequest);
  }

  /**
   * Success selfie converted
   * @param {Object} detail
   */
  _successDocumentSelfieConverted({detail}) {
    let configRequest = {
      imageFile: detail.file,
      verificationId: this.veridasOpenBoxId,
      attachement: 'selfie-image',
      documentType: 'MX'
    };
    this.set('_photoConvertedResult.documentSelfie', detail);
    this.set('_configRequest.documentSelfie', configRequest);

    //this.openVeridasBox();

  }

  /**
   * Send even to to save the photo in veridas
   * @param {Object} configRequest
   * @event 'update-national-id-put-documents-verification'
   */
  _savePhotoInVeridas(configRequest) {
    this._dispatch('put-documents-verification', configRequest);
  }

  /**
   * Document without flash saved success
   */
  successPutDocumentWithoutFlash() {
    this.set('obverseFlag', true);
    this._savePhotoInVeridas(this._configRequest.documentReverse);
  }

  /**
   * Document reverse saved success
   */
  successPutDocumentReverse() {
    this.set('reverseFlag', true);
    this._savePhotoInVeridas(this._configRequest.documentSelfie);
  }

  /**
  * Document selfie saved success
  */
  successPutSelfie() {
    this.set('selfieFlag', true);
  }

  hideSpinnerPutVerifications(obverseFlag, reverseFlag, selfieFlag) {
    if (obverseFlag && reverseFlag && selfieFlag) {
      this._failedRequest = 0;
      this._dispatch('hide-spinner', false);
      this._closeVeridasBox();
    }
  }

  errorPutVerificationsWithoutFlash() {
    this._failedRequest++;
    this._dispatch('hide-spinner', false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-PUT-VERIFICATIONS-WITHOUT-FLASH', true, 'alert-communication-error-message-retry');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  errorPutVerificationsWithFlash() {
    this._failedRequest++;
    this._dispatch('hide-spinner', false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-PUT-VERIFICATIONS-WITH-FLASH', true, 'alert-communication-error-message-retry');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  errorPutVerificationsReverse() {
    this._failedRequest++;
    this._dispatch('hide-spinner', false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-PUT-VERIFICATIONS-REVERSE', true, 'alert-communication-error-message-retry');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  errorPutVerificationsSelfie() {
    this._failedRequest++;
    this._dispatch('hide-spinner', false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-PUT-VERIFICATIONS-SELFIE', true, 'alert-communication-error-message-retry');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  retryPutWithoutFlash() {
    this._dispatch('open-spinner', true);
    this.set('obverseFlag', false);
    this._savePhotoInVeridas(this._configRequest.documentWithoutFlash);
  }

  retryPutWithFlash() {
    this._dispatch('open-spinner', true);
    this.set('obverseFlashFlag', false);
    this._savePhotoInVeridas(this._configRequest.documentWithFlash);
  }

  retryPutReverse() {
    this._dispatch('open-spinner', true);
    this.set('reverseFlag', false);
    this._savePhotoInVeridas(this._configRequest.documentReverse);
  }

  retryPutSelfie() {
    this._dispatch('open-spinner', true);
    this.set('selfieFlag', false);
    this._savePhotoInVeridas(this._configRequest.documentSelfie);
  }
  /**
   * Update glomo-step-add-national-id information
   */
  _updateAddNationalIdStep() {
    const identificationButtons = [
      {
        button: {
          value: `IMG${this.photoName}0.jpg`,
          class: 'transparent st-links',
          eventName: 'show-front-document-preview'
        }
      },
      {
        button: {
          value: `IMG${this.photoName}2.jpg`,
          class: 'transparent st-links',
          eventName: 'show-reverse-document-preview',
        }
      }
    ];
    const selfieButton = {
      cellslist: {
        list: [
          {
            text: `IMG${this.photoName}3.jpg`,
            icon: 'coronita:document',
            classList: 'exampleClass'
          }
        ],
        showDelete: true
      }
    };
    const config = {
      mainDescription: [],
      glomoDescription: [
        {
          text: {
            value: 'update-national-id-step-config-glomo-description-text-value',
            class: 'text-description'
          }
        },
        this._isIdentificationScanned ? {
          glomolist: {
            title: 'update-national-id-step-config-glomo-description-is-identification-scanned-title',
            icon: 'coronita:trash'
          }
        } : '',
        this._isIdentificationScanned ? identificationButtons[0] : {button: {
          value: 'Escanear INE/IFE',
          class: 'transparent st-link',
          eventName: 'scan-id'
        }},
        this._isIdentificationScanned ? identificationButtons[1] : '',
        {
          text: {
            value: 'update-national-id-step-config-glomo-description-is-identification-scanned-button-1-text',
            class: 'text-description'
          }
        },
        {
          message: {
            value: 'update-national-id-step-config-glomo-description-is-identification-scanned-button-1-message',
            class: 'inline',
            icon: 'coronita:info',
            type: 'info'
          }
        },
        this._isSelfieTaked ? {...selfieButton} : {button: {
          value: 'Tomar foto',
          class: 'transparent st-link',
          eventName: 'take-selfie'
        }},
        {
          title: {
            value: 'update-national-id-step-config-glomo-description-is-selfie-taked-button-title',
            subtitle: 'update-national-id-step-config-glomo-description-is-selfie-taked-button-sub-title',
            class: 'text-primary-identity'
          }
        },
        {
          button: {
            value: 'Aviso de privacidad',
            class: 'transparent st-link',
            eventName: 'notice-privacy'
          }
        }
      ],
      isAllPhotosCaptured: this._isSelfieTaked && this._isIdentificationScanned,
      filledLists: [
        `IMG${this.photoName}0.jpg`,
        `IMG${this.photoName}2.jpg`
      ]
    };
    this._dispatch('set-add-national-step', config);
  }

  /**
   * Show front document preview
   */
  showFrontDocumentPreview() {
    this._showPhotoPreview(this._documentEvidence[0].url, true);
  }

  /**
   * Show reverse document preview
   */
  showReverseDocumentPreview() {
    this._showPhotoPreview(this._documentEvidence[2].url, true);
  }

  /**
   * Show selfie preview
   */
  showSelfiePreview() {
    this._showPhotoPreview(this._selfieEvidence[0].url);
  }

  /**
   * Config the object to show the preview photo in the modal
   * @param {String} url
   * @event 'update-national-id-show-photo-preview'
   */
  _showPhotoPreview(url, rotate = false) {
    const config = {
      openModal: true,
      rotate,
      closeButton: true,
      nameTitle: 'update-national-id-show-photo-preview-name-title',
      closeIconIdRigth: 'coronita:close',
      imageAsBody: url,
      modalClass: 'gray-header',
      acceptButtonTitle: 'update-national-id-show-photo-preview-accept-button-title'
    };

    this._dispatch('show-photo-preview', config);
  }

  /**
   * Remove identification photos
   */
  removeIdentificationPhotos() {
    this.set('_isIdentificationScanned', false);
    this.set('_documentEvidence', []);
    this.set('_photoConvertedResult.documentWithoutFlash', '');
    this.set('_photoConvertedResult.documentWithFlash', '');
    this.set('_photoConvertedResult.documentReverse', '');
    this._updateAddNationalIdStep();
  }

  /**
   * Remove selfie photos
   */
  removeSelfiePhotos() {
    this.set('_isSelfieTaked', false);
    this.set('_selfieEvidence', []);
    this.set('_photoConvertedResult.documentSelfie', '');
    this._updateAddNationalIdStep();
  }

  /**
   * Show modal to confirm delete ID
   */
  showConfirmDeleteDocumentModal() {
    this._createConfirmDeletModal('CONFIRM-DELETE-ID', 'update-national-id-show-confirm-delete-document-modal');
  }

  /**
   * Show modal to confirm delete
   */
  showConfirmDeleteSelfieModal() {
    this._createConfirmDeletModal('CONFIRM-DELETE-SELFIE', 'update-national-id-show-confirm-delete-selfie-modal');
  }

  /**
   * Create the object to show the modal to confirm delete photos
   * @event 'update-national-id-show-confirm-delete-modal'
   */
  _createConfirmDeletModal(code, text) {
    const configModal = {
      code: code,
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'update-national-id-create-confirm-delete-modal-accept-label',
        cancelBtLabel: 'update-national-id-create-confirm-delete-modal-cancel-label',
        template: {
          type: 'paragraphs',
          values: [
            {icon: 'coronita:alert'},
            {text: text}
          ]
        }
      }
    };

    this._dispatch('show-confirm-delete-modal', configModal);
  }

  alertManager() {
    const alertManagerNoticePrivacy = {
      code: 'code',
      selectedConfig: {
        className: 'info full-height-info header--white sd--image-margin full-hero-image',
        openMaximized: true,
        title: 'update-national-id-alert-manager-title',
        heroImage: './images/bbva-logo2.svg',
        acceptBtLabel: 'update-national-id-alert-manager-accept-label',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'update-national-id-alert-manager-values-title', class: 'text-align-left below-paragraph spacing' },
            { text: 'update-national-id-alert-manager-values-text-1', class: 'text-align-left spacing' },
            { text: ' ', class: 'spacing' },
            { text: 'update-national-id-alert-manager-values-text-2', class: 'text-align-left' }
          ]
        }
      }
    };

    this.dispatchEvent(new CustomEvent('alert-manager', {
      detail: alertManagerNoticePrivacy,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Configuration to show the modal with recomendatios for capture ID
   */
  configModalCardAdvice() {
    const configOneButton = {
      code: 'go-to-scann-id',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'paragraph__only',
        openMaximized: true,
        title: 'update-national-id-config-one-button-title',
        hideCloseIcon: false, //hideCloseIcon: false,//
        heroImage: './images/nationalId/camera.svg',
        acceptBtLabel: 'update-national-id-config-one-button-accept-label',
        template: {
          type: 'paragraphs',
          values: [
            {title: 'update-national-id-config-one-button-values-title'},
            {
              list: [
                'update-national-id-config-one-button-values-list-1',
                'update-national-id-config-one-button-values-list-2',
                'update-national-id-config-one-button-values-list-3'
              ],
              class: 'cells-lists-with-text-left'
            },
          ]
        }
      }
    };
    this._dispatch('show-document-info-modal', configOneButton);
  }

  configModalHelp() {
    let config = {
      isOpened: 'true',
      selectedConfig: {
        heroImage: '',
        headerTitle: 'update-national-id-header-title',
        acceptButton: 'update-national-id-accept-button',
        icon: 'help',
        values: [{
          class: 'text-centered margin-top-m',
          text: 'update-national-id-value-paragraph-1',
          images: [{
            path: './images/nationalId/ocr-1.png',
            imgWidth: '40%'
          },
          {
            path: './images/nationalId/ocr-2.png',
            imgWidth: '40%'
          }]
        },
        {
          class: 'text-centered margin-top-m',
          text: 'update-national-id-value-paragraph-2',
          images: [{
            path: './images/nationalId/elector-key-1.png',
            imgWidth: '40%'
          },
          {
            path: './images/nationalId/elector-key-2.png',
            imgWidth: '40%'
          }]
        },
        {
          class: 'text-centered margin-top-m',
          text: 'update-national-id-value-paragraph-3',
          images: [{
            path: './images/nationalId/front-ine-1.png',
            imgWidth: '40%'
          },
          {
            path: './images/nationalId/front-ine-2.png',
            imgWidth: '40%'
          }]
        }]
      }
    };
    this._dispatch('set-modal-help', config);
  }

  /**
   * Main description of the glomo-step-add-national-id
   */
  _setAddNationalIdStep() {
    let config = {
      stepTitle: 'update-national-id-add-national-id-step-title',
      mainDescription: [{
        text: {
          value: 'update-national-id-add-national-id-step-text-value-1',
          class: 'text-description'
        }
      },
      {
        button: {
          value: 'Escanear INE/IFE',
          class: 'transparent st-link',
          eventName: 'scan-id'
        }
      },
      {
        text: {
          value: 'update-national-id-add-national-id-step-text-value-2',
          class: 'text-description'
        }
      },
      {
        message: {
          value: 'update-national-id-add-national-id-step-message-value',
          class: 'inline',
          icon: 'coronita:info',
          type: 'info'
        }
      },
      {
        button: {
          value: 'Tomar foto',
          class: 'transparent st-link',
          eventName: 'take-selfie'
        }
      },
      {
        title: {
          value: 'update-national-id-add-national-id-step-title-value',
          subtitle: 'update-national-id-add-national-id-step-title-subtitle',
          class: 'text-primary-identity'
        }
      },
      {
        button: {
          value: 'Aviso de privacidad',
          class: 'transparent st-link',
          eventName: 'notice-privacy'
        }
      }
      ],
      checkboxLabel: 'update-national-id-add-national-id-step-checkbox-label',
      textButton: 'update-national-id-add-national-id-step-button',
      filledMessageDescription: 'update-national-id-add-national-id-step-filled-message-description',
      filledList: 'update-naitional-id-add-national-id-step-filled-filled-list-title'
    };
    this._dispatch('set-add-national-step', config);
  }

  /**
   * Build coonfig fot the glomo-step-check-national-id component
   * @param {String} ocr
   * @param {String} electorKey
   * @param {String} releaseNumber
   * @param {String} validity
   * @param {Boolean} validateInputs
   */
  _setCheckStep(ocr = '', electorKey = '', releaseNumber = '', validity = '', validateInputs = false) {
    let config = {
      validateInputs,
      selectedConfig: {
        mainDescription: [
          {
            text: 'update-national-id-check-step-text'
          },
          {
            simulationId: 'ocr',
            icono: 'update-national-id-check-step-1-icono',
            maxlong: '13',
            iconerrortam: '12',
            carval: 'update-national-id-check-step-1-carval',
            labelnum: 'update-national-id-check-step-1-label-num',
            allowedval: '^[0-9]{13}$',
            allowedcar: '[0-9]',
            simulationValue: ocr
          },
          {
            simulationId: 'electorKey',
            icono: 'update-national-id-check-step-2-icono',
            maxlong: '18',
            iconerrortam: '12',
            carval: 'update-national-id-check-step-2-carval',
            labelnum: 'update-national-id-check-step-2-label-num',
            allowedval: '^[a-zA-Z0-9]{18}$',
            allowedcar: '[a-zA-Z0-9]',
            simulationValue: electorKey
          },
          {
            simulationId: 'releaseNumber',
            icono: 'update-national-id-check-step-3-icono',
            maxlong: '2',
            iconerrortam: '12',
            carval: 'update-national-id-check-step-3-carval',
            labelnum: 'update-national-id-check-step-3-label-num',
            allowedval: '^[0-9]{2}$',
            allowedcar: '[0-9]',
            simulationValue: releaseNumber
          },
          {
            simulationId: 'validity',
            icono: 'update-national-id-check-step-4-icono',
            maxlong: '4',
            iconerrortam: '12',
            carval: 'update-national-id-check-step-4-carval',
            labelnum: 'update-national-id-check-step-4-label-num',
            allowedval: '^20[2-9]{1}[2-9]{1}|^20[3-9]{1}[0-9]{1}',
            allowedcar: '[0-9]',
            simulationValue: validity
          },
          {
            infomess: 'update-national-id-check-step-infomess',
          },
        ]
      },
      stepTitle: 'update-national-id-check-national-id-step-title',
      textButton: 'update-national-id-check-national-id-step-button',
      inputStatusValidate: true,
      collapsedText: 'update-national-id-check-step-collapsed-text',
      collapsedTextSecond: 'update-national-id-check-step-collapsed-text-second',
      subtitleSameInfo: 'glomo-step-check-national-id-subtitle-same-info',
      messageButtonNumero: 'glomo-step-check-national-id-message-button-numero',
      messageButtonClaveElector: 'glomo-step-check-national-id-message-button-clave-elector',
      messageButtonNumeroEmision: 'glomo-step-check-national-id-message-button-numero-emision',
      messageButtonVigencia: 'glomo-step-check-national-id-message-button-vigencia',
      infoMessage: 'glomo-step-check-national-id-info-message'
    };
    this._dispatch('set-check-national-id-step', config);
  }

  /**
   * Build the receipt config data
   */
  _setSuccessScreen() {
    let config = {
      id: 'updateNationalIdReceipt',
      mainIcon: {
        src: './images/Illustration.svg',
        info: 'Operation Success'
      },
      mainTitle: {
        key: 'update-national-id-success-screen-main-title-key',
        value: this._successModifyFlow.operationDate,
        class: 'bold with-default-space',
        descriptionClass: 'spacing-top-b light-key'
      },
      topInfo: [{
        class: 'mask-bold spacing-top light-key',
        key: 'update-national-id-success-screen-top-info-1-key',
      },
      {
        class: 'bold-value spacing-top light-key',
        key: 'update-national-id-success-screen-top-info-2-key',
      },
      {
        class: '',
        value: `IMG${this.photoName}0.jpg`
      },
      {
        class: '',
        value: `IMG${this.photoName}2.jpg`
      },
      {
        class: 'bold-value spacing-top light-key',
        key: 'update-national-id-success-screen-top-info-3-key',
      },
      {
        class: '',
        value: this._correctDocumentData.ocr
      },
      {
        class: 'bold-value spacing-top light-key',
        key: 'update-national-id-success-screen-top-info-4-key',
      },
      {
        class: '',
        value: this._correctDocumentData.validity
      },
      {
        class: 'bold-value spacing-top light-key',
        key: 'update-national-id-success-screen-top-info-5-key',
      },
      {
        class: '',
        value: this._successModifyFlow.folio
      },
      {
        class: 'mask-bold spacing-top light-key',
        key: 'update-national-id-success-screen-top-info-6-key',
        value: this.userEmail
      }],
      buttons: {
        primary: {
          text: this.flagIneTdc ? 'cells-successful-response-next-tdc' : 'cells-successful-response-next',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };

    this._dispatch('set-receipt', config);
    this._dispatch('set-success-title', this.pageTitle);
    this._fireAnalytic('app-completed', this._successModifyFlow?.folio);

  }

  /**
   * --------------------------------------------------
   * SECCION DE METODOS PARA LA APIS
   * --------------------------------------------------
   */

  //APIS EN EL PRIMER STEP---------------------------

  /**
   * @Desc Request post customers terms
   */
  requestCostumersTerms() {
    let body = [ {
      termType: {
        id: 'BD-MX-AA-COTRAD-001'
      },
      acceptanceMethod: {
        id: 'Autorizado con Firma Electrónica'
      },
      referenceNumber: 'Actualizacion INE',
      acceptanceMessages: [ {
        value: 'Autorizo el tratamiento de mis datos personales y la imagen contenida en la fotografía, para la actualización del expediente relacionado con mis productos financieros contratados.'
      } ]
    } ];
    this._updateCustomerHeaders({'Content-Type': 'application/json', 'Accept-Language': 'es'});
    this._dispatch('request-costumers-terms', body);
  }

  /**
   * @Desc Success post customer terms
   */
  successPostCustomerTerms(response) {
    this._failedRequest = 0;
    this.set('tsecSigned', response.newTsec);
    this._updateCustomerHeaders({tsec: this.tsecSigned, 'Accept-Language': 'es'});
    if (!this._isVeridasBoxClosed) {
      const topMessage =  this.t('update-national-id-spinner-2-top-message');
      this._dispatch('set-top-message-spinner-2', topMessage);
      this._dispatch('open-spinner', true);
      this._savePhotoInVeridas(this._configRequest.documentWithoutFlash);
    }
    if (this._isVeridasBoxClosed) {
      this._validateDocumentsWithNationalElectoralInstitute();
    }
  }

  /**
   * @Desc Error post customer terms
   */
  errorRequestCustomerTerms() {
    this._failedRequest++;
    this._showSpinner(false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-REQUEST-TERMS', true, 'alert-communication-error-message-retry');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  /**
  * @Desc Error documents verifications
  */
  errorDocumentsVerifications() {
    this._failedDocumentVerifications++;
    this._showSpinner(false);
    if (this._failedDocumentVerifications < 3) {
      this._showErrorModalConnection('ERROR-DOCUMENT-VERIFICATIONS', true, 'alert-communication-error-message-retry');
      this._fireAnalytic('footprint-communication', '');
      this.resetStepAdd();
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  /**
   * Close veridas box when the post customers terms is ok
   * @event 'update-national-id-close-veridas-box'
   */
  _closeVeridasBox() {
    const topMessage =  this.t('update-national-id-spinner-1-top-message');
    this._dispatch('set-top-message', topMessage);
    this._dispatch('close-veridas-box', this.veridasOpenBoxId);
  }

  resetStepAdd() {
    this.reset();
    this.resetFlags();
    this._dispatch('reset-step-add');
  }

  resetFlags() {
    this.set('obverseFlag', false);
    this.set('obverseFlashFlag', false);
    this.set('reverseFlag', false);
    this.set('selfieFlag', false);
  }

  /**
   * Send request to know the status of veridas processVerify
   */
  successCloseVeridasBox() {
    this._failedRequest = 0;
    this._dispatch('verify-veridas-box-status', this.veridasOpenBoxId);
  }

  /**
   * Verify if the process is DONE
   * @param {Object} payload
   */
  getVeridasBoxStatusSucess(payload) {
    if (payload.status.id === 'DONE') {
      this._failedRequest = 0;
      const {documentExtractedData: {optionalData: {ocrNumber, identificationNumber, registerYear, emisionNumber}, expirationDate}} = payload;
      const expirationDateTransofrm = expirationDate ?  expirationDate.split('-')[0] : '';
      this.set('_correctDocumentData', {registerYear});
      this._setCheckStep(ocrNumber, identificationNumber, emisionNumber, expirationDateTransofrm, true);
      this._dispatch('get-veridas-close-box-status-done', true);
      this.set('_isVeridasBoxClosed', true);
      this._fireAnalytic('app-step-5', '');
    } else if (payload.status.id === 'PROCESSING') {
      setTimeout(() => this._dispatch('verify-veridas-box-status', this.veridasOpenBoxId), 3500);
    } else {
      this.errorVeridasBox(payload);
    }
    this._dispatch('reset-molecule-input', true);
  }

  /**
   * Recovery the value of the inputs from the glomo-step-check-national-id step
   * @param {Oobject} detail
   */
  recoveryInputValues(detail) {
    let registerYear = this._correctDocumentData.registerYear;
    this.set('_correctDocumentData',  Object.assign(detail, {registerYear}));

    const bodyTerms = [
      {
        termType: {
          id: 'BD-MX-AA-USODPS-001'
        },
        status: {
          id: 'ACCEPTED'
        },
        acceptanceMethod: {
          id: 'Autorizado con Firma Electrónica'
        },
        referenceNumber: this._correctDocumentData.ocr,
        acceptanceMessages: [
          {
            value: 'Al continuar nos otorgas tu consentimiento para que consultemos los datos de tu identificación ante el INE.'
          }
        ]
      }
    ];

    const summaryCheckStep = {
      ocrValue: this._correctDocumentData.ocr,
      validityValue: this._correctDocumentData.validity
    };

    this._dispatch('set-check-national-id-step', summaryCheckStep);
    this._updateCustomerHeaders({'Content-Type': 'application/json', 'Accept-Language': 'es'});
    this._dispatch('request-costumers-terms', bodyTerms);
  }

  /**
   * Validate the user data with the INE
   */
  _validateDocumentsWithNationalElectoralInstitute() {
    let formData =  new FormData();
    const requestConfig = {
      auditLog: {
        branch: {
          id: '3307'
        },
        operationType: {
          id: 'GI'
        }
      },
      customer: {
        identityDocuments: [
          {
            documentType: {
              id: 'INE'
            },
            code: this._correctDocumentData.ocr,
            key: this._correctDocumentData.electorKey,
            folio: this._correctDocumentData.releaseNumber,
            registerYear: this._correctDocumentData.registerYear,
            releaseYear: this._correctDocumentData.validity
          }
        ]
      }
    };

    formData.append('metadata', JSON.stringify(requestConfig));

    this._dispatch('validate-documents-with-national-electoral-institute', formData);
  }

  /**
   * Validate if the user data is correct with the INE
   * @param {Object} payload
   */
  successPostNationalElectoralInstituteValidate(payload) {
    const auditResult = payload.auditLog.validationResults.filter(element => String(element.validationResultType).includes('VISIT_INE'));

    if (auditResult.length) {
      this._failedValidateDocuments++;
      if (this._failedValidateDocuments < 3) {
        this._showErrorModals('VISIT-ELECTORAL-INSITUTE', true, 'Datos incorrectos', 'Datos incorrectos', [
          { text: 'update-national-id-success-post-audit-show-error-modals-text' }
        ]);
        this._fireAnalytic('footprint-invalid-data', '');
        this._dispatch('not-change', true);
      } else {
        this._showErrorModals('GENERIC-ERROR-EXIT', false, 'Datos incorrectos', 'Datos incorrectos', [
          { text: 'update-national-id-success-post-audit-show-error-modals-text-final' },
          {list: [
            'update-national-id-success-post-audit-show-error-modals-list-1',
            'update-national-id-success-post-audit-show-error-modals-list-2',
          ],
          class: 'cells-lists-with-text-left'}
        ]);

        this._fireAnalytic('footprint-invalid-data', '');
        this._dispatch('not-change', true);
      }
    } else {
      this._failedRequest = 0;
      this._failedVeridas = 0;
      this._failedValidateDocuments = 0;
      this._failedDocumentVerifications = 0;
      this._dispatch('collapsed-step-2', true);
      this._dispatch('final-step', true);
    }
  }

  /**
   * Show error modal if request failed
   * @param {Object} payload
   */
  errorPostNationalElectoralInstituteValidate(payload) {
    this._failedRequest++;
    this._showSpinner(false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-INE-VALIDATE', true, 'glomo-conversation-non-blocking-error-body-text');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  /**
   * Init the end of the flow
   */
  closeAddNationalIdFlow() {
    this._showSpinner(true);
    this._modifyCustomer();
  }

  /**
   * Update the documents data in the customers API
   */
  _modifyCustomer() {
    const body = {
      identityDocuments: [
        {
          expirationDate: `${this._correctDocumentData.validity}-12-31`,
          documentNumber: this._correctDocumentData.ocr,
          documentType: {
            id: 'INE'
          }
        },
        {},
        {},
        {},
        {}
      ]
    };
    this._updateCustomerHeaders({'Content-Type': 'application/json', 'Accept-Language': 'es'});
    this._dispatch('modify-customer-document-data', body);
  }

  /**
   * Save the overse side of the user document
   * @param {Object} payload
   */
  successPatchCustomer(payload) {
    this._failedRequest = 0;
    const successData = {
      folio: payload.operationNumber,
      operationDate: payload.operationDate
    };
    this.set('_successModifyFlow', successData);
    this._postCustomerIdentificationProcess('OBVERSE', this._photoConvertedResult.documentWithoutFlash.file, 'FIRST_PAGE');
  }

  errorPatchCustomer() {
    this._failedRequest++;
    this._showSpinner(false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-PATCH-CUSTOMER', true, 'glomo-conversation-non-blocking-error-body-text');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  /**
   * Save the reverse side of the user document
   */
  successPostOverseDocument(payload) {
    this._failedRequest = 0;
    this._postCustomerIdentificationProcess('REVERSE', this._photoConvertedResult.documentReverse.file, 'LAST_PAGE');
  }

  errorPostOverseDocument() {
    this._failedRequest++;
    this._showSpinner(false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-OVERSE-DOCUMENT', true, 'glomo-conversation-non-blocking-error-body-text');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  /**
   * Success on save new documents user
   * @param {Object} payload
   */
  successPostReverseDocument() {
    this._failedRequest = 0;
    this._showSpinner(false);
    this._setNavigation();
    this._setSuccessScreen();
  }

  errorPostReverseDocument() {
    this._failedRequest++;
    this._showSpinner(false);
    if (this._failedRequest < 3) {
      this._showErrorModalConnection('ERROR-REVERSE-DOCUMENT', true, 'glomo-conversation-non-blocking-error-body-text');
      this._fireAnalytic('footprint-communication', '');
    } else {
      this._showErrorModalConnection('GENERIC-ERROR-EXIT', false, 'alert-communication-error-message');
      this._fireAnalytic('footprint-communication', '');
    }
  }

  /**
   * Build the config to save the new document user
   * @param {String} side
   * @param {File} file
   */
  _postCustomerIdentificationProcess(side, file, page) {
    let formData = new FormData();
    const documentInfo = {
      side,
      metadata: [
        {
          key: 'DOCUMENT_TYPE_ID',
          value: '001'
        },
        {
          key: 'PRODUCT',
          value: 'GM'
        },
        {
          key: 'OPERATION_TYPE',
          value: 'saveDocCteTempGM'
        },
        {
          key: 'REFERENCE_NUMBER',
          value: ''
        },
        {
          key: 'PROCEDURE',
          value: 'A2'
        }
      ],
      pageType: page,
      contentInfo: {
        contentData: 'identificacion INE',
        contentType: 'jpg',
        documentFamily: 'jpg'
      },
      documentType: 'O',
      verificationType: [
        {
          id: 'NAME'
        }
      ]
    };

    formData.append('file', file, file.name);
    this._updateCustomerHeaders({'Content-Type': 'multipart/form-data', 'Accept-Language': 'es'});
    formData.append('documentInfo', new Blob([ JSON.stringify(documentInfo) ], {type: 'application/json'}));

    this._dispatch('update-customer-documents', {body: formData, side});
  }

  /**
   * Build config to show error modals
   * @param {Stirng} modalCode
   * @param {Boolean} retry
   * @param {String} modalTitle
   * @param {String} messageTitle
   * @param {String} messageValue
   */
  _showErrorModals(modalCode, retry, modalTitle, messageTitle, messageValue) {
    const config = {
      code: modalCode,
      selectedConfig: {
        className: 'full-height-error header--title-grey',
        hideCloseIcon: false,
        openMaximized: true,
        title: modalTitle,
        heroImage: './images/errors/fo_error.svg',
        message: messageTitle,
        acceptBtLabel: retry ? 'update-national-id-show-error-modals-retry-bt-label' : 'update-national-id-show-error-modals-accept-bt-label',
        template: {
          type: 'paragraphs',
          values: messageValue
        }
      }
    };
    this._dispatch('show-error-modal', config);
  }
  /**
   * Build config to show error modals
   * @param {Stirng} modalCode
   * @param {Boolean} retry
   */

  _showErrorModalConnection(modalCode, retry, message) {
    const config = {
      code: modalCode,
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: retry ? 'special-modal-button-retry' : 'alert-GENERAL-ERROR-cancel',

        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:alert',
            iconClass: 'icon-size-24'
          },
          {
            title: 'communication-error-modal-title-text'
          },
          {
            text: message
          }
          ]
        }
      }
    };
    if (retry) {
      config.selectedConfig.cancelBtLabel = 'special-modal-button-exit';
    }
    this._dispatch('show-error-modal', config);
  }

  /**
   * Build config to show error permissions modal
   * @param {Stirng} modalCode
   * @param {Boolean} retry
   */
  _showErrorModalPermissions(modalCode, message) {
    let config = {
      code: modalCode,
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'update-national-id-show-error-modals-retry-bt-label',
        cancelBtLabel: 'update-national-id-status-incomplete-cancel-bt-label',
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:alert',
            iconClass: 'icon-size-24'
          },
          {
            title: ''
          },
          {
            text: message
          }
          ]
        }
      }
    };
    this._dispatch('show-error-modal', config);
  }

  /**
   * Dispatch event for exit flow and reset
   */
  exitFlow() {
    if (this._fromInApp) {
      this._dispatch('navigate-to-dashboard');
    }
    this._dispatch('exit-flow-reset');
    this.removeIdentificationPhotos();
    this.removeSelfiePhotos();
    this.resetFlags();
    this._setCheckStep();
    this._dispatch('reset-molecule-input', false);
    this.closeConfirm();
    this._fromInApp = false;
  }

  /**
   * Close confirm zone
   */
  closeConfirm() {
    this._dispatch('close-confirm');
  }
  /**
   * Update Headers for customers dm
   * @param {Object} headers
   */
  _updateCustomerHeaders(headers) {
    this._dispatch('send-headers-customer-dm', headers);
  }

  _showSpinner(show) {
    this._dispatch(show ? 'show-spinner' : 'hide-spinner', show);
  }

  _dispatch(nameEvent = '', detailValue = {}) {
    this.dispatchEvent(new CustomEvent('update-national-id-' + nameEvent, {
      detail: detailValue,
      bubbles: true,
      composed: true
    }));
  }

  /**
    * Generic analytics firing method
    * @param {String} eventName
  */
  _fireAnalytic(eventName, detail) {
    this._dispatch(`analytics-fire-${eventName}`, detail);
  }
  /**
   * Runs when you start step one
   */
  _searchBusinessAgent() {
    this._dispatch('set-phone-number-label', this.t(this.phoneNumberLabel));
    this._dispatch('set-client-number-label', this.t(this.numberClientLabel));

    this._dispatch('search-native-flag', this.searchNativeFlag);
    this._executeGetBusinessAgent();
  }

  /**
   * Receives data when consulting the existence of the flag
   * @param {Object} response
   */
  flagFound({feature, isFlagEnable, module}) {
    if (feature === 'updateProofAdress' && isFlagEnable && module === 'assistanceSection') {
      this.flagEnabled = true;
    } else {
      this.flagEnabled = false;
    }
  }

  /**
   * Send customer-id to CustomersBGADPV0
   */
  _executeGetBusinessAgent() {
    this._dispatch('set-for-business-agent-customer-id', this.customerId);
    this._dispatch('execute-get-business-agent');
  }

  /**
   * Success request bussiness-agent
   * @param {Object} response
   */
  succesGetBusinnesAgent(response) {
    const { businessAgentType: { id }, contactDetails: [ contact ], firstName, lastName, secondLastName } = response;
    if (id === 'TRADITIONAL') {
      this.set('hasBusinessAgent', true);
      this.set('businessAgent.contactDetails', contact);
      this.set('businessAgent.firstName', firstName);
      this.set('businessAgent.lastName', lastName);
      this.set('businessAgent.secondLastName', secondLastName);
    } else {
      this.set('hasBusinessAgent', false);
    }
  }

  /**
   * Send the payload for request to the banker
   */
  _sendNotificationBanker() {
    const receiverName = `${this.get('businessAgent.firstName')} ${this.get('businessAgent.lastName')} ${this.get('businessAgent.secondLastName')}`;
    const clientName = `${this.get('globalCacheStorage.customer.firstName') } ${this.get('globalCacheStorage.customer.lastName')} ${this.get('globalCacheStorage.customer.secondLastName')}`;
    const body = {
      body: {
        'eventCode': this.sendEmailEventCode,
        'senderId': this.senderId,
        'devices': [
          {
            'id': this.devicesId,
            'serviceProvider': {
              'id': this.serviceProviderId
            },
            'receivers': [
              this.businessAgent.contactDetails.contact
            ]
          }
        ],
        'message': {
          'messageBody': this.createMessageBody(receiverName, clientName, this.t('update-national-id-notification-personal-adviser-email-message'))
        }
      },
      urlParams: {
        'customer-id=': this.globalCacheStorage.customer.customerId
      }
    };
    this._dispatch('post-notifcation-business-agent', body);
  }

  /**
   * @desc return message body in this format "{\"sSASSISTANCENAME\":\"Guillermo\",\"sSCLIENTNAME\":\"Hueluz Mtp\",\"sSCLIENTMESSAGE\":\"Prueba mensaje para Banquero Remoto\"}"
   * @param {String} receiverName
   * @param {String} clientName
   * @param {String} message
   * @return {String}
   */
  createMessageBody(receiverName, clientName, message) {
    this.phoneNumber = this._formatNumberAndId(this.get('customer.phoneNumber', this.globalCacheStorage));
    this.clientId = this.clientId || this._formatNumberAndId(this.get('globalCacheStorage.customer.clientId'));
    let escChar = '\"';
    let messageFinal = `${this.phoneNumberLabel}: ${this.phoneNumber} ${this.numberClientLabel}: ${this.clientId} ${message}`;
    let data = ['sSASSISTANCENAME', ':', receiverName, ',', 'sSCLIENTNAME', ':', clientName, ',', 'sSCLIENTMESSAGE', ':', messageFinal.trim()];
    return '{' + escChar + data.join(escChar) + escChar + '}';
  }

  /**
   * format Number and Id
   * @param {*} field
   */
  _formatNumberAndId(field) {
    if (field) {
      let formatField = `${this.maskCharacter}${(field.substr(-4))}`;
      return formatField;
    }
  }

  /**
   * @Desc Validates when user comes from inApp and set flag
   * @param {Object} data
   */
  setFromInApp(data = {}) {
    this._fromInApp = this.get('page', data) === 'updateNationalId';
  }

  /**
   * @Desc Dispatch event to set backAction for successful navigation page.
   * when user comes from inApp returns to dashbaord
   */
  _setNavigation() {
    const navigation = this._fromInApp ? 'navigate-to-dashboard' : 'navigate-to-previous-page';
    this._dispatch('set-back-action', navigation);
  }
}

customElements.define(GlomoAddNationalIdManager.is, GlomoAddNationalIdManager);
