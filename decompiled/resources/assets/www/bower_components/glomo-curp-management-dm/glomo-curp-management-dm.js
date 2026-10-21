{
  const withGhostStepManager = BaseClass => class extends BaseClass {
    static get observers() {
      return [
        '_ghostStepsVisibilityHandler(canExecute, _steps.*, currentStep)'
      ];
    }

    /**
     * Handle Ghost Step visibility
     *
     * @param {Boolean} canExecute
     * @param {Object} _steps
     * @param {Number} currentStep // not used but needed for dispatch observer
     */
    _ghostStepsVisibilityHandler(canExecute, _steps) {
      Object.keys(this._steps)
        .map(stepKey => this._steps[stepKey])
        .filter(step => step.isGhost)
        .forEach(step => step.hidden = !canExecute);
    }

    /**
     * After parent do the properties reset
     * update ghost step state related properties changed by parent
     */
    _resetStepProps(...args) {
      super._resetStepProps(...args);
      this._resetGhostStep();
    }

    /**
     * After parent do the properties reset
     * update ghost step state related properties changed by parent
     */
    resetWithDefaultSettings() {
      super.resetWithDefaultSettings();
      this._resetGhostStep();
    }

    /**
     * Ghost step reset handler
     * Do a hard reset to update observers after any reset action from parent class
     */
    _resetGhostStep() {
      Object.keys(this._steps)
        .map(stepKey => this._steps[stepKey])
        .filter(step => step.isGhost)
        .forEach(step => {
          const prevState = step.isGhost; // Get current ghost state value
          step.isGhost = null; // Do a change to force an update into property observer
          step.isGhost = prevState; // Restore previous state
        });
    }
  };

  const BaseManagerClass = Polymer.mixinBehaviors([CellsBehaviors.StepManagerBehavior, CellsBehaviors.i18nBehavior], Polymer.Element);
  class GlomoCurpManagementDm extends withGhostStepManager(BaseManagerClass) {

    static get is() {
      return 'glomo-curp-management-dm';
    }

    static get properties() {
      return {
        /**
         * Object containing customer information
         * @type {Object}
         */
        dataCustomer: {
          type: Object,
          value: () => {}
        },
        /**
         * Parameter that stores the response of the list civil register service
         * @type {Object}
         */
        responseCivilRegister: {
          type: Object,
          value: () => {}
        },
        /**
         * Variable that stores the curp value
         * @type {String}
         */
        curpValue: {
          type: String,
          value: ''
        },
        /**
         * Object that keeps the list of the states of the country
         * @type {Object}
         */
        listStates: {
          type: Object,
          value: () => {}
        },
        /**
         * Variable that stores the customer date of birth
         * @type {String}
         */
        birthDate: {
          type: String,
          value: ''
        },
        /**
         * Variable that stores the id of the country state
         * @type {String}
         */
        stateId: {
          type: String,
          value: ''
        },
        /**
         * Variable that stores the customer's gender
         * @type {String}
         */
        genderId: {
          type: String,
          value: ''
        },
        /**
         * Flag to edit the curp
         * @type {Boolean}
         */
        curpNotEditable: {
          type: Boolean,
          value: false
        },
        /**
         * Object that saves the success screen information
         * @type {Object}
         */
        resultSuccess: {
          type: Object,
          value: () => {}
        },
        /**
         * Counter to retry requests
         * @type {Number}
         */
        counterRequest: {
          type: Number,
          value: 0
        },
        /**
         * Flag to know if a client is a foreigner
         * @type {Boolean}
         */
        isExternal: {
          type: Boolean,
          value: false
        },
        activeModal: {
          type: Boolean,
          value: false
        },
        stateName: {
          type: String,
          value: ''
        },
        /**
         * Constants object for curp flow
         * @type {Object}
         */
        CONSTANTS: {
          type: Object,
          value: {
            CURP_CONSTANT: 'CURP',
            CURP_CIVIL_REGISTER_ERROR_CONSTANT: 'CURP-CIVIL-REGISTER-ERROR',
            CURP_MODIFY_ERROR_CONSTANT: 'CURP-MODIFY-ERROR',
            HIDE_SPINNER_CONSTANT: 'hide-spinner',
            LIST_RECORD_CONSTANT: '06320074E',
            MONTHS: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
            SHOW_SPINNER_CONSTANT: 'show-spinner',
            TITLE_ADD_CONSTANT: 'glomo-curp-management-title-add',
            TITLE_CONFIRM_CONSTANT: 'glomo-curp-management-title-confirm',
            RETRY_TEXT_CONSTANT: 'glomo-curp-management-retry-text',
            EXIT_TEXT_CONSTANT: 'glomo-curp-management-exit-text',

          }
        }
      };
    }

    /**
     * Goes to next step collapsing current one.
     */
    goToNext() {
      this._steps[this.currentStep].collapsed = true;
      this._nextStep();
    }

    /**
     * Receives a step and goes to that step received,
     * uncollapsing it, and collapsing every other step.
     * If the current step hasn't been scrolled, remains unactive.
     * @param {{currentStep, collapsed, active, ...rest}} cellsStep
     */
    goToStep(step) {
      const stepToNavigate = this._steps[step.currentStep];
      if (stepToNavigate) {
        stepToNavigate.collapsed = false;
        this.toggleCollapsedView(stepToNavigate);
        this._activateSteps(stepToNavigate);
      }
    }

    /**
     * Reset
     */
    reset(pageActive) {
      if (pageActive && pageActive.value) {
        this._dispatchEvent('reset-input-data', this.curpNotEditable ? true : false);
        this.resetWithDefaultSettings();
        let data = [{ key: '', value: '' }, { key: '', value: '' }, { key: '', value: '' }];
        this._dispatchEvent('disable-button-second-step', true);
        this._dispatchEvent('set-data-user-confirm', data);
        this._dispatchEvent('input-invalid-curp', false);
        this._dispatchEvent('reset-scroll', true);
        this._dispatchEvent('set-input-label', this.CONSTANTS.CURP_CONSTANT);
      } else if (pageActive && !pageActive.value) {
        this.curpValue = '';
      }
    }
    /**
    * Handles a step back request on the process.
    */
    manageBackButton() {
      if (this.activeModal) {
        this._dispatchEvent('close-active-modal');
        this.activeModal = false;
      } else {
        this._dispatchEvent('go-to-profile');
      }
    }

    activeModalClosed() {
      this.activeModal = false;
    }

    activeModalOpened() {
      this.activeModal = true;
    }

    /**
     * Dispatches an event with data
     * @param {String} eventName name of event
     * @param {Object} detail data to send
     */
    _dispatchEvent(eventName, detail) {
      this.dispatchEvent(new CustomEvent(eventName, {
        detail,
        bubbles: true,
        composed: true
      }));
    }

    /**
     * Method that validates if the object comes with curp and starts the flow
     * @param {Object} data
     */
    validateDataCurp(data) {
      this._fireAnalytic('app-visit', '');
      this.set('dataCustomer', data);
      this._dispatchEvent('set-input-label', '');
      this._dispatchEvent(this.CONSTANTS.SHOW_SPINNER_CONSTANT);
      this._dispatchEvent('search-list-records', this.CONSTANTS.LIST_RECORD_CONSTANT);
      if (data && data.curp !== '' && data.curp !== undefined) {
        let curpConfirmModal = {
          code: 'update-confirm-curp',
          selectedConfig: {
            acceptBtLabel: 'glomo-curp-management-continue',
            onAcceptDetail: data,
            className: 'full-height-error sd--image-margin curp-update-confirm',
            openMaximized: true,
            title: this.CONSTANTS.TITLE_CONFIRM_CONSTANT,
            heroImage: './images/verified-document.svg',
            template: {
              type: 'paragraphs',
              values: [
                {
                  text: `<h1> ${this.t(this.CONSTANTS.TITLE_CONFIRM_CONSTANT)} </h1>`,
                  class: 'spacing--xs'
                },
                {
                  text: 'glomo-curp-management-text-confirm'
                },
                {
                  text: 'glomo-curp-management-text-confirm-two',
                  class: 'ul-li--text-left'
                }
              ]
            }
          }
        };
        this._dispatchEvent('set-without-reason-text', data.curp);
        this._dispatchEvent('set-input-label', this.CONSTANTS.CURP_CONSTANT);
        this.set('curpValue', data.curp);
        this.set('curpNotEditable', true);
        this._dispatchEvent('open-modal-with-info', curpConfirmModal);
        this._dispatchEvent('set-header-title', this.CONSTANTS.TITLE_CONFIRM_CONSTANT);
        this._dispatchEvent('set-change-label', 'cells-step-input-message-step-change-label-secondary');
        this._dispatchEvent('show-icon-message', true);
        this._dispatchEvent('text-description', 'cells-step-input-message-curp-description-two');
        this._dispatchEvent('icon-error-message', 'coronita:info');
        this._dispatchEvent('molecule-input-message-read-only', true);
        this._dispatchEvent('disabled-molecule-input-message', true);
        this._dispatchEvent('manual-validation-button-first-step', false);
      } else {
        this._dispatchEvent('set-input-label', this.CONSTANTS.CURP_CONSTANT);
        this.set('curpNotEditable', false);
        this._dispatchEvent('text-error-icon-size', '10');
        this._dispatchEvent('text-error-icon', 'glomo-curp-management-invalid-format');
        this._dispatchEvent('molecule-input-message-read-only', false);
        this._dispatchEvent('disabled-molecule-input-message', false);
        this._dispatchEvent('manual-validation-button-first-step', true);
        this._dispatchEvent('set-regex-format', /^([a-z]{4})([0-9]{6})([a-z]{6})([0-9]{2})$/i);
        this._dispatchEvent('show-icon-message', false);
        this._dispatchEvent('text-description', 'cells-step-input-message-curp-description');
        this._dispatchEvent('set-header-title', 'cells-step-input-message-curp-title-two');
      }
      this._dispatchEvent('set-customer-id', this.dataCustomer.customerId);
      this._dispatchEvent('show-skeleton-cells-step-list', true);
      this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
    }

    /**
     * Method to set the successful response of list records
     * @param {Object} response
     */
    setResponseListRecords(response) {
      if (Object.keys(response).length) {
        this.counterRequest = 0;
        this.set('listStates', response);
      }
      this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
    }

    /**
     * Method to set the wrong response from list records
     * @param {Object} data
     */
    setResponseListRecordsError(data) {
      let modalError = this.showErrorComunicationModal('CURP-RECORDS-ERROR', 'CURP-RECORDS-ERROR');
      this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
      this._dispatchEvent('glomo-curp-modal-info', modalError);
    }

    /**
     * Method to display information modal
     */
    setModalInfoIcon() {
      this._dispatchEvent('glomo-curp-modal-info', {
        code: 'code',
        selectedConfig: {
          className: 'info full-height-info header--white',
          openMaximized: true,
          title: 'glomo-curp-management-info',
          acceptBtLabel: 'glomo-curp-management-got-it',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:help'
              },
              {
                title: this.CONSTANTS.CURP_CONSTANT
              },
              {
                text: 'glomo-curp-management-info-text',
                class: 'text-center spacing'
              },
              {
                title: 'glomo-curp-management-renapo-title'
              },
              {
                text: 'glomo-curp-management-renapo-text',
                class: 'text-center'
              }
            ]
          }
        }
      });
    }

    /**
     * Modal from list File from input message
     */
    setModalListFile() {
      this._dispatchEvent('glomo-curp-modal-info', {
        code: 'code',
        selectedConfig: {
          className: 'info full-height-info header--white full-hero-image',
          heroImage: './images/bbva-logo2.svg',
          openMaximized: true,
          title: 'glomo-curp-management-notice-privacy-title',
          acceptBtLabel: 'glomo-curp-management-got-it',
          template: {
            type: 'paragraphs',
            values: [
              {
                title: 'glomo-curp-management-notice-privacy-title-two',
                class: 'text-align-left below-paragraph spacing'
              },
              {
                text: 'glomo-curp-management-notice-privacy-text',
                class: 'text-align-left spacing'
              },
              {
                text: 'glomo-curp-management-notice-privacy-text-two',
                class: 'text-align-left'
              }
            ]
          }
        }
      });
    }

    /**
     * Method to validate if curp is coming and send the request with or without data
     * @param {Object} data
     */
    validateCurp(data) {
      if (this.curpValue !== '') {
        this.requestCivilRegister('');
      } else {
        this.set('curpValue', data);
        this.requestCivilRegister(data);
      }
    }

    /**
     * Method to send the list civil register petition
     * @param {Object} data
     */
    requestCivilRegister(data) {
      const curpData = data !== '' ? data : this.curpValue;
      let bodyRequest = {
        name: this.dataCustomer.firstName,
        lastName: this.dataCustomer.lastName,
        secondLastName: this.dataCustomer.secondLastName,
        documentNumber: curpData.toUpperCase(),
        identityDocuments: {
          identificationCode: this.CONSTANTS.CURP_CONSTANT
        },
        birthDate: this.dataCustomer?.birthData?.birthDate,
        gender: {
          id: this.dataCustomer?.gender?.id
        }
      };
      this._dispatchEvent(this.CONSTANTS.SHOW_SPINNER_CONSTANT);
      this._dispatchEvent('set-active', true);
      this._dispatchEvent('search-civil-register-curp', bodyRequest);
    }

    /**
     * Method to set the successful response of list civil register
     * @param {Object} response
     */
    setResponseCivilRegister(response) {
      if (Object.keys(response).length) {
        this.counterRequest = 0;
        this.set('responseCivilRegister', response);
        const dateBirthday = response[0].birthDate.split('-');
        const date = `${dateBirthday[2]} ${this.CONSTANTS.MONTHS[parseInt(dateBirthday[1]) - 1]} ${dateBirthday[0]}`;
        this.data = [
          {
            key: 'glomo-curp-management-birthdate-title',
            value: date
          },
          {
            key: 'glomo-curp-management-gender-title',
            value: response[0].gender.id === 'MALE' ? this.t('glomo-curp-management-gender-male') : this.t('glomo-curp-management-gender-female')
          },
        ];

        if (response[0].birthPlace !== 'NE') {
          this.stateName = this._getStates(response[0].birthPlace);
          this.data.push({
            key: 'glomo-curp-management-birthplace-title',
            value: this.stateName
          });
          this._fireAnalytic('footprint-user-mx', '');
        } else {
          this.isExternal = true;
          this._fireAnalytic('footprint-user-foreign', '');
        }

        this._dispatchEvent('set-without-reason-text', this.curpValue.toUpperCase());
        this._dispatchEvent('set-data-user-confirm', this.data);
        this._dispatchEvent(this.CONSTANTS.SHOW_SPINNER_CONSTANT);
        this._dispatchEvent('show-skeleton-cells-step-list', false);
        this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
        this._dispatchEvent('disable-button-second-step', false);
        this._fireAnalytic('app-step-2', '');
      }
      this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
    }

    /**
     * Method to set the wrong response of list civil register
     * @param {Object} response
     */
    setResponseCivilRegisterError(response) {
      let modalError;
      this.counterRequest += 1;
      const errorText = response.messages && response.messages[0].message.split('#', 1).toString();
      switch (parseInt(errorText).toString()) {
        case 'NaN':
          modalError = this.showErrorComunicationModal(this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT, this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT);
          break;
        case '915290':
          modalError = {
            code: this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT,
            selectedConfig: {
              className: 'info',
              iconOnlyFullHeight: true,
              acceptBtLabel: this.counterRequest < 3 ? this.CONSTANTS.RETRY_TEXT_CONSTANT : this.CONSTANTS.EXIT_TEXT_CONSTANT,
              onAcceptDetail: this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT,
              cancelBtLabel: this.counterRequest < 3 ? this.CONSTANTS.EXIT_TEXT_CONSTANT : '',
              template: {
                type: 'paragraphs',
                values: [
                  {
                    icon: 'coronita:alert'
                  },
                  {
                    title: 'glomo-curp-management-invalid-curp-title'
                  },
                  {
                    text: 'glomo-curp-management-invalid-curp-text'
                  }
                ]
              }
            }
          };
          this._fireAnalytic('footprint-error-invalid-curp', '');
          break;
        case '915309':
          modalError = {
            code: this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT,
            selectedConfig: {
              className: 'info full-height-error sd--image-margin',
              openMaximized: true,
              heroImage: './images/errors/error.svg',
              iconOnlyFullHeight: true,
              acceptBtLabel: this.counterRequest < 3 ? this.CONSTANTS.RETRY_TEXT_CONSTANT : this.CONSTANTS.EXIT_TEXT_CONSTANT,
              onAcceptDetail: this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT,
              cancelBtLabel: this.counterRequest < 3 ? this.CONSTANTS.EXIT_TEXT_CONSTANT : '',
              title: 'glomo-curp-management-non-existent-curp-title',
              template: {
                type: 'paragraphs',
                values: [
                  {
                    text: `<h2>${this.t('glomo-curp-management-non-existent-curp-title')}</h2>`
                  },
                  {
                    text: `${this.t('glomo-curp-management-non-existent-curp-verify-text')}<br>${this.curpValue.toUpperCase()}<br>`
                  },
                  {
                    text: 'glomo-curp-management-non-existent-curp-text'
                  },
                  {
                    text: 'glomo-curp-management-non-existent-curp-text-two'
                  },
                  {
                    text: 'glomo-curp-management-non-existent-curp-text-three',
                    class: 'ul-li--text-left'
                  }
                ]
              }
            }
          };
          this._fireAnalytic('footprint-error-non-existent-curp', '');
          break;
        default:
          modalError = {
            code: this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT,
            selectedConfig: {
              className: 'info full-height-error',
              openMaximized: true,
              heroImage: './images/errors/error.svg',
              iconOnlyFullHeight: true,
              acceptBtLabel: this.counterRequest < 3 ? this.CONSTANTS.RETRY_TEXT_CONSTANT : this.CONSTANTS.EXIT_TEXT_CONSTANT,
              onAcceptDetail: this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT,
              cancelBtLabel: this.counterRequest < 3 ? this.CONSTANTS.EXIT_TEXT_CONSTANT : '',
              title: this.t('glomo-curp-management-incorrect-curp-data-title'),
              template: {
                type: 'paragraphs',
                values: [
                  {
                    text: `<h2>${this.t('glomo-curp-management-incorrect-curp-data-title')}</h2>`
                  },
                  {
                    text: 'glomo-curp-management-incorrect-curp-data-text'
                  },
                  {
                    text: 'glomo-curp-management-incorrect-curp-data-text-two'
                  },
                  {
                    text: 'glomo-curp-management-incorrect-curp-data-text-three',
                    class: 'ul-li--text-left'
                  }
                ]
              }
            }
          };
          break;
      }
      this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
      this._dispatchEvent('glomo-curp-modal-info', modalError);
    }

    /**
     * Method to show the communication error modal
     * @param {String} codeError
     * @param {String} acceptDetail
     * @returns {Object}
     */
    showErrorComunicationModal(codeError, acceptDetail) {
      this._dispatchEvent(this.CONSTANTS.HIDE_SPINNER_CONSTANT);
      return {
        code: codeError,
        selectedConfig: {
          className: 'error',
          iconOnlyFullHeight: true,
          acceptBtLabel: this.counterRequest < 3 ? this.CONSTANTS.RETRY_TEXT_CONSTANT : this.CONSTANTS.EXIT_TEXT_CONSTANT,
          onAcceptDetail: acceptDetail,
          cancelBtLabel: this.counterRequest < 3 ? this.CONSTANTS.EXIT_TEXT_CONSTANT : '',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:alert'
              },
              {
                title: 'glomo-curp-management-communication-error-title'
              },
              {
                text: 'glomo-curp-management-communication-error-text'
              }
            ]
          }
        }
      };
    }

    /**
     * Method to get the birth status by id
     * @param {Object} id
     * @returns {Object}
     */
    _getStates(id) {
      let stateId = id;
      let stateName = '';
      if (id === 'ME') {
        stateId = 'MC';
      }
      const stateData = this.listStates.find(state => state.id === stateId);
      const stateDataDescription = stateData && (stateData.descriptions[0].value).split(' ');
      function capitalizeFirstLetter(str) {
        return str.charAt(0).toUpperCase() + str.slice(1).toLowerCase();
      }
      switch (stateId) {
        case 'BC':
        case 'DF':
        case 'NL':
        case 'QR':
          stateName = `${capitalizeFirstLetter(stateDataDescription[0])} ${capitalizeFirstLetter(stateDataDescription[1])}`;
          break;
        case 'SP':
        case 'BS':
          stateName = `${capitalizeFirstLetter(stateDataDescription[0])} ${capitalizeFirstLetter(stateDataDescription[1])} ${capitalizeFirstLetter(stateDataDescription[2])}`;
          break;
        default:
          stateName = `${capitalizeFirstLetter(stateDataDescription[0])}`;
          break;
      }
      return stateName;
    }

    /**
     * Method to make the curp update request
     */
    requestModifyCurp() {
      let payload = {
        identityDocuments: [{},
          {},
          {},
          {},
          {
            documentNumber: this.curpValue.toUpperCase(),
            documentType: {
              id: this.CONSTANTS.CURP_CONSTANT
            }
          }
        ]
      };
      this._dispatchEvent('request-patch-modify-customer', payload);
    }

    /**
     * Method to set the successful information of the modify customer
     * @param {Object} response
     */
    setResponsePatchCustomer(response) {
      if (Object.keys(response).length) {
        this.counterRequest = 0;
        const dateBirthday = response.birthData.birthDate.split('-');
        const date = `${dateBirthday[2]} ${this.CONSTANTS.MONTHS[parseInt(dateBirthday[1]) - 1]} ${dateBirthday[0]}`;


        let result = {
          mainIcon: {
            src: './images/check_successful.svg',
            info: 'Operation Success'
          },
          mainTitle: {
            key: 'glomo-curp-management-successful-curp-update-title',
            value: response.operationDate,
            class: 'bold bold-value'
          },
          topInfo: [
            {
              key: 'glomo-curp-management-successful-curp-update-text',
              class: 'bold-value light-key'
            },
            {
              key: this.CONSTANTS.CURP_CONSTANT,
              class: 'bold-value spacing-top light-key'
            },
            {
              value: response.identityDocuments.find(document => document.documentType.id === 'CURP').documentNumber,
              class: ''
            },
            {
              key: 'glomo-curp-management-birthdate-title',
              class: 'bold-value spacing-top light-key',
            },
            {
              value: date,
              class: ''
            },
            {
              key: 'glomo-curp-management-gender-title',
              class: 'bold-value spacing-top light-key',
            },
            {
              value: response.gender.id === 'MALE' ? this.t('glomo-curp-management-gender-male') : this.t('glomo-curp-management-gender-female'),
              class: ''
            },
            {
              key: !this.isExternal ? 'glomo-curp-management-birthplace-title' : '',
              class: !this.isExternal ? 'bold-value spacing-top light-key' : ''
            },
            {
              value: !this.isExternal ? this.stateName : '',
              class: ''
            }
          ],
          additionalInfo: [
            {
              key: 'glomo-curp-management-successful-curp-update-text-three',
              class: 'bold-value light-key',
            },
            {
              value: response.operationNumber,
              class: ''
            },
            {
              key: 'glomo-curp-management-successful-curp-update-text-four',
              class: 'bold-value spacing-top light-key',
            },
            {
              value: `••${this.dataCustomer.email && this.dataCustomer.email.replace(/[*]/g, '').toLowerCase()}`,
              class: ''
            }
          ],
          buttons: {
            primary: {
              text: 'cells-successful-response-next',
              action: 'go-to-next'
            },
            secondary: {
              hidden: true
            }
          },
          isCurpNotEditable: this.curpNotEditable
        };
        this._dispatchEvent('curp-update-process-succcess', result);
        this._fireAnalytic('app-completed', { operationNumber: response.operationNumber });
      }
    }

    /**
     * Method to set the wrong information of the modify customer
     * @param {Object} response
     */
    setResponsePatchCustomerError(response) {
      let modalError;
      this.counterRequest += 1;
      let  messageError = this.get('messages.0.message', response);
      if ((messageError.includes('E2') && messageError.includes('01519039')) || messageError.includes('01519009') || messageError.includes('01519010') || messageError.includes('1519011')) {
        modalError = {
          code: this.CONSTANTS.CURP_MODIFY_ERROR_CONSTANT,
          selectedConfig: {
            className: 'info full-height-error sd--image-margin',
            openMaximized: true,
            heroImage: './images/errors/error.svg',
            iconOnlyFullHeight: true,
            acceptBtLabel: this.counterRequest < 3 ? this.CONSTANTS.RETRY_TEXT_CONSTANT : this.CONSTANTS.EXIT_TEXT_CONSTANT,
            onAcceptDetail: this.CONSTANTS.CURP_MODIFY_ERROR_CONSTANT,
            cancelBtLabel: this.counterRequest < 3 ? this.CONSTANTS.EXIT_TEXT_CONSTANT : '',
            title: this.t('glomo-curp-management-incorrect-curp-data-title'),
            template: {
              type: 'paragraphs',
              values: [
                {
                  text: `<h2>${this.t('glomo-curp-management-incorrect-curp-data-title')}</h2>`
                },
                {
                  text: 'glomo-curp-management-incorrect-curp-data-text'
                },
                {
                  text: 'glomo-curp-management-incorrect-curp-data-text-two'
                },
                {
                  text: 'glomo-curp-management-incorrect-curp-data-text-three',
                  class: 'ul-li--text-left'
                }
              ]
            }
          }
        };
      } else {
        modalError = this.showErrorComunicationModal(this.CONSTANTS.CURP_MODIFY_ERROR_CONSTANT, this.CONSTANTS.CURP_MODIFY_ERROR_CONSTANT);
      }
      this._dispatchEvent('glomo-curp-modal-info', modalError);
    }

    /**
     * Method to set the values when the step cells-step-input-message is uncollapsed
     */
    inputMessageCollapsed() {
      console.log();
      if (this.curpNotEditable) {
        this._dispatchEvent('set-without-reason-text', this.curpValue);
        this._dispatchEvent('molecule-input-message-read-only', true);
        this._dispatchEvent('disabled-molecule-input-message', true);
      } else {
        this.set('curpValue', '');
      }
      let data = [{ key: '', value: '' }, { key: '', value: '' }, { key: '', value: '' }];
      this._dispatchEvent('set-data-user-confirm', data);
      this._dispatchEvent('show-skeleton-cells-step-list', true);
      this._dispatchEvent('disable-button-second-step', true);
      this._dispatchEvent('set-collapsed', false);
      this._dispatchEvent('set-active', false);
    }

    /**
     * Method to set the success screen
     * @param {Object} data
     */
    setSuccessResult(data) {
      this._dispatchEvent('set-title-success-text', data.isCurpNotEditable ? this.CONSTANTS.TITLE_CONFIRM_CONSTANT : 'glomo-curp-management-title-add');
      this._dispatchEvent('set-result', data);
    }

    /**
     * Method to retry the request as the case may be
     * @param {String} detail
     */
    retryRequest(detail) {
      if (this.counterRequest < 3) {
        switch (detail) {
          case this.CONSTANTS.CURP_MODIFY_ERROR_CONSTANT:
            this.requestModifyCurp();
            break;
          case this.CONSTANTS.CURP_CIVIL_REGISTER_ERROR_CONSTANT:
            this.curpValue = this.curpNotEditable ? this.curpValue : '';
            if (this.curpNotEditable) {
              this.requestCivilRegister('');
            } else {
              this._dispatchEvent('set-without-reason-text', '');
              this.reset({value: true});
            }
            break;
          default:
            this._dispatchEvent('search-list-records', this.CONSTANTS.LIST_RECORD_CONSTANT);
            break;
        }
      } else {
        this.counterRequest = 0;
        this._dispatchEvent('go-to-profile');
      }
    }

    /**
     * Generic analytics firing method
     * @param {String} eventName
     */
    _fireAnalytic(eventName, detail) {
      this._dispatchEvent(`analytics-fire-${eventName}`, detail);
    }
  }

  customElements.define(GlomoCurpManagementDm.is, GlomoCurpManagementDm);
}
